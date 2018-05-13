package classWork_polymorphism2;

class Main {
	public static void main(String[] args) {
		Cow c1 = new Cow();
		Calf c3 = new Calf();
		Cow c2 = c3;

		c1.chat(c3);
		c3.chat(c1);
		c1.chat(c2);
		c2.chat(c3);
		c3.chat(c2);
	}

}