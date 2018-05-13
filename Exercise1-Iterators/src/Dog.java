import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dog {
	String name;

	// Constructor
	public Dog(String n) {
		this.name = n;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {

		Collection<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("Fido"));
		dogList.add(new Dog("Spot"));
		dogList.add(new Dog("Lucy"));

		System.out.println(dogList);

		for (Dog i : dogList) {
			if (i.name == "Spot") {
				System.out.println(i.name);
				System.out.println();
				
			}
		}

		Iterator<Dog> dogIter = dogList.iterator();
		while (dogIter.hasNext()) {
			System.out.println(dogIter.next());
			dogIter.remove(); //good
			
		}
	}

}
