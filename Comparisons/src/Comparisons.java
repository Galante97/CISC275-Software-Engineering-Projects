import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Comparisons implements Comparator<Wombat> {
	public static void main (String[] args) {
		List<Wombat> herd = new ArrayList<Wombat>(); //assume this list is full of wombats
		herd.add(new Wombat("James", 4));
		herd.add(new Wombat("Matt", 4));
		herd.add(new Wombat("Chris", 4));
		herd.add(new Wombat("ALexa", 4));
		herd.add(new Wombat("Alli", 4));
		herd.add(new Wombat("Jake", 4));
		herd.add(new Wombat("Stephen", 4));
		herd.add(new Wombat("Matt", 4));


		int picNum = 0;
		int frameCount = 1;
		
		System.out.println(herd);
		
		Collections.sort(herd, new Comparisons());
		
		System.out.println(herd);

	}
	
	@Override
	public int compare(Wombat o1, Wombat o2) {
		return o1.compareTo(o2);
	}
}
