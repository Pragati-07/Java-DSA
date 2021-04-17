package classes_and_objects;

public class PolynomialUse {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		p1.setCoefficient(0, 3);
		p1.setCoefficient(1, 0);
		p1.setCoefficient(2, 2);
		p1.print();
		
		Polynomial p2 = new Polynomial();
		p2.setCoefficient(0, 3);
		p2.setCoefficient(1, 4);
		p2.setCoefficient(2, 5);
		p2.print();
		
		p1.multiply(p2);
		p1.print();
		
		System.out.println(p2.evaluate(2));
		
		Polynomial p3 = Polynomial.add(p1, p2);
		p3.print();
	}

}
