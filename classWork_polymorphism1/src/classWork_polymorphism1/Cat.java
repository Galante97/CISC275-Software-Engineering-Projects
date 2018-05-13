package classWork_polymorphism1;

public class Cat {
	public String sizeCode = "Large";

	public String toString() {
		return "Cat";
	}

	public static void gamma(Cat c1) {
		System.out.println("gamma " + c1.toString());
	}

	public static void delta(Cat c1) {
		System.out.println("Delta " + c1.sizeCode);
	}

	public static void catta(Cat c1, Cat c2) {
		System.out.println("catta " + c1 + " " + c2);
	}

	public static void spama(Cat c1, Cat c2) {
		System.out.println("spama " + c1.sizeCode + " " + c2.sizeCode);
	}

	public static void main(String[] args) {
		Cat c1 = new Cat();
		SubCat s1 = new SubCat();
		Cat c2 = s1;

		delta(s1);
		gamma(s1);
		catta(c1, c2);
		spama(c1, c2);
	}

}
