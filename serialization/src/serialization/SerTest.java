package serialization;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SerTest {
	@Test
	public void serializeToDisk() {
		try {
			Person ted = new serialization.Person("Ted", "Neward", 39);
			Person charl = new serialization.Person("Charlotte", "Neward", 38);
			
			ted.setSpouse(charl);
			charl.setSpouse(ted);
			

			FileOutputStream fos = new FileOutputStream("tempdata.ser"); //write to file
			ObjectOutputStream oos = new ObjectOutputStream(fos);			//write to file
			oos.writeObject(ted);										//write to file
			oos.close();													//write to file
			
			
		} catch (Exception ex) {
			fail("Exception thrown during test: " + ex.toString());
		}

		try {
			FileInputStream fis = new FileInputStream("tempdata.ser");			//read and recreate object
			ObjectInputStream ois = new ObjectInputStream(fis);					//read and recreate object
			serialization.Person ted = (serialization.Person) ois.readObject();   //read and recreate object
			ois.close();															//read and recreate object

			assertEquals(ted.getFirstName(), "Ted");
			assertEquals(ted.getSpouse().getFirstName(), "Charlotte");

			// Clean up the file
			new File("tempdata.ser").delete();
		} catch (Exception ex) {
			fail("Exception thrown during test: " + ex.toString());
		}
	}
}
