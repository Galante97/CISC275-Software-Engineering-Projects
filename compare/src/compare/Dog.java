package compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dog extends Animal {
	
	public Dog(String N, int L) {
		this.name = N;
		this.numLegs = L;
		
	}
	
	 
	
	public String toString() {
		return name;
		
	}
	
	public static void main(String[] args) {
		Collection<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("Spot", 4));
		dogList.add(new Dog("Xavier", 3));
		dogList.add(new Dog("Colt", 4));
        
		
		System.out.println(dogList);
	}
	
}
