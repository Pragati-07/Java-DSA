package classes_and_objects;

public class Polynomial {
	
	DynamicArray coefficients;
	
	public Polynomial() {
		coefficients = new DynamicArray();
	}
	
	public void setCoefficient(int deg, int coeff) {
		coefficients.set(deg, coeff);
	}
	
	public int getCoefficient(int deg) {
		return coefficients.get(deg);
	}
	
	public int degree() {
		return coefficients.size();
	}
	
	public void print() {
		for(int i=0;i<degree();i++) {
			if(this.getCoefficient(i)!=0) {
				if(this.getCoefficient(i)<0 && i!=0) {
					System.out.print(" - ");
				}else if(this.getCoefficient(i)>0 && i!=0) {
					System.out.print(" + ");
				}
				System.out.print(Math.abs(this.getCoefficient(i))+"x^"+i);
			}
		}
		System.out.println();
	}
	
	public void add(Polynomial p) {
		for(int i=0; i<p.degree();i++) {
			this.setCoefficient(i,this.getCoefficient(i)+p.getCoefficient(i));
		}
	}
	
	public void subtract(Polynomial p) {
		for(int i=0; i<p.degree();i++) {
			this.setCoefficient(i,this.getCoefficient(i)-p.getCoefficient(i));
		}
	}
	
	public void multiply(Polynomial p) {
		Polynomial prod = new Polynomial();
		for(int i=0;i<this.degree()+p.degree()-1;i++)
			prod.setCoefficient(i, 0);
		for(int i=0; i<this.degree();i++) {
			for(int j=0; j<p.degree();j++) {
				prod.setCoefficient(i+j,prod.getCoefficient(i+j)+this.getCoefficient(i)*p.getCoefficient(j));
			}
		}
		for(int i=0;i<prod.degree();i++) {
			this.setCoefficient(i, prod.getCoefficient(i));
		}
	}	
	
	public int evaluate(int x) {
		int sum=0,f=0;
		for(int i=0;i<this.degree();i++) {
			sum = sum + this.getCoefficient(i)*(int)Math.pow(x, f);
			f++;
		}
		return sum;
	}
	
	public static Polynomial add(Polynomial p1, Polynomial p2) {
		Polynomial p = new Polynomial();
		int i;
		for(i=0;i<Math.min(p1.degree(), p2.degree());i++) {
			p.setCoefficient(i, p1.getCoefficient(i)+p2.getCoefficient(i));
		}
		if(p1.degree()>p2.degree()) {
			while(i<p1.degree()) {
			p.setCoefficient(i, p1.getCoefficient(i));
			i++;
			}
		}else {
			while(i<p2.degree()) {
				p.setCoefficient(i, p2.getCoefficient(i));
				i++;
				}
		}
		return p;
	}
}
