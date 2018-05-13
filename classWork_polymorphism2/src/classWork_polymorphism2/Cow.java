package classWork_polymorphism2;

public class Cow {

	String say = "B";

	String speak() {
		return say;
	}

	void chat(Cow c1) {
		System.out.println("A " + this.speak() + " G " + c1.speak());
	}
}

class Calf extends Cow {
	Calf() {
		say = "F";
	}

	void chat(Cow c1) {
		System.out.println("G " + this.speak() + " C " + c1.speak());
	}
}

