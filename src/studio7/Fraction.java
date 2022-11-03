package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	public Fraction(int initnumerator, int initdenominator) {
		numerator = initnumerator;
		denominator = initdenominator;
	}
	public String add(Fraction f) {
		int num = this.numerator*f.denominator;
		 int num2= f.numerator*this.denominator;
		 int num3= this.denominator*f.denominator;
		return (num+num2)+"/"+num3;
	}
	public String multiply(Fraction f) {
		return this.numerator*f.numerator+"/"+this.denominator*f.denominator;
	}
	public String reciprocal() {
		return denominator+"/"+numerator;
	}
	public String simply() {
		int temp = 1;
		for (int i = 1; i < denominator; i++) {
			if (denominator%i == 0 && numerator%i == 0) {
				temp = i;
			}
		}

		return (numerator/temp + "/" + denominator/temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2,6);
		Fraction f2 = new Fraction(10,12);
		System.out.println(f1.simply());
		
	}

}
