package test;

public class DougFraction {
	
	private int num;
	private int den;

	public DougFraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public int getNum() {
		return this.num;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	public int getDen() {
		return this.den;
	}
	
	void setDen(int den) {
		this.den = den;
	}
	
	public String toString() {
		String result;
		result = Integer.toString(num) + "/" + Integer.toString(den);
		return result;
	}
	
	public DougFraction add(DougFraction fToAdd) {
		int n1, n2, d1, d2, n, d;
		DougFraction res;
		
		n = fToAdd.getNum();
		d = fToAdd.getDen();
		if (this.den == d) {
			System.out.println("Denominators are the same");
			n1 = this.num;
			n2 = n;
			d1 = this.den;
			d2 = d;
		} else {
			System.out.println("Denominators are the different");
			n1 = this.num * d;
			d1 = this.den * d;
			n2 = n * this.den;
			d2 = d * this.den;
		}
		res = new DougFraction(n1 + n2, d2);
		
		return res;
	}
	
	public DougFraction reduce(DougFraction inFrac) {
		int n, d, n1, d1, tn1, n2, d2;
		DougFraction res;
		
		n = inFrac.getNum();
		d = inFrac.getDen();
		n1 = n;
		d1 = d;
		tn1 = 0;
		
		while (n1 != 0) {
			tn1 = n1;
			// System.out.println("n1: " + n1 + ", d1: " + d1 + ", tn1: " + tn1);
			n1 = d1 % n1;
			d1 = tn1;
		}
		
		n2 = n / tn1;
		d2 = d / tn1;
		
		
		/**
		int n1, d1, n2, d2, gcd;
		Fraction res;
		
		n1 = inFrac.getNum();
		d1 = inFrac.getDen();
		
		gcd = gcd(n1, d1);
		
		n2 = n1 / gcd;
		d2 = d1 / gcd;
		*/
		
		res = new DougFraction(n2, d2);
		return res;
	}
	
	private static int gcd(int n, int d) {
		return d == 0 ? n : gcd(d, n % d);
	}

}
