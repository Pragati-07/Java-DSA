package classes_and_objects;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void print() {
		if(this.imaginary<0)
			System.out.println(this.real+" - "+(-1*this.imaginary)+"i");
		else
			System.out.println(this.real+" + "+this.imaginary+"i");
	}
	
	public void add(ComplexNumber c2) {
		this.real += c2.getReal();
		this.imaginary += c2.getImaginary();
	}
	
	public void multiply(ComplexNumber c2) {
		int re = this.real*c2.getReal() - this.imaginary*c2.getImaginary();
		int img= this.imaginary*c2.getReal() + this.real*c2.getImaginary();
		this.real = re;
		this.imaginary = img;
	}
	
	public ComplexNumber conjugate() {
		ComplexNumber c = new ComplexNumber(this.real, -1*this.imaginary);
		return c;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int re = c1.getReal()+c2.getReal();
		int img = c1.getImaginary()+c2.getImaginary();
		ComplexNumber c = new ComplexNumber(re, img);
		return c;
	}
}
