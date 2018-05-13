import java.util.ArrayList;
import java.util.Collection;

public class Cat {
	String name;
	Integer numLegs;
	Integer weight;
	
	 Cat(String N, Integer L, Integer W) {
		 this.name = N;
		 this.numLegs = L;
		 this.weight = W;
		 
	 } 
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Collection<Cat> catList = new ArrayList<Cat>();
		catList.add(new Cat("James", 4, 150));
		catList.add(new Cat("Paul", 4, 170));
		catList.add(new Cat("Andrew", 4, 165));

		System.out.println(catList);
	}

}
