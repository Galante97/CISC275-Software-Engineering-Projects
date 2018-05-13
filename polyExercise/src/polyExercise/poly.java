package polyExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class poly {

	public static void main(String[] arugula) {
		
		Collection<Animal> a = new ArrayList<Animal>();
		a.add(new Cow());
		a.add(new Dog());
		a.add(new Fish());
		
		for (Animal animal : a)  { 
			System.out.println("a "+ animal + " " + animal.getNoise());
				
		}
		
		System.out.println();
		
		for (Animal animal : a)  { 
			System.out.println("a "+ animal + " " + animal.movementType());
		}
		
		return;
	}

}
