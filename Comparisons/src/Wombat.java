import java.util.Comparator;

public class Wombat implements Comparable<Wombat>  {
	String name;
	int numLegs;
	
	public  Wombat(String Name, int legs) {
		this.name = Name;
		this.numLegs = legs;
		
	}
	
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int compareTo(Wombat o) {
		return this.getName().compareTo(o.getName());
	}


	

}
