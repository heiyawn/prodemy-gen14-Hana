package tugas4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class WriterRider {

	public static void main(String[] args) {
		Barang b1 = new Barang("Oreo", 5000, 10);
		Barang b2 = new Barang("Silverqueen", 50000, 20);
		Barang b3 = new Barang("Ultra", 7000, 13);
		
		try {
			FileOutputStream f = new FileOutputStream(new File("Barang.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(b1);
			o.writeObject(b2);
			o.writeObject(b3);
			
			o.close();
			f.close();
			
			FileInputStream fi = new FileInputStream(new File("Barang.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
						
			Barang brg1 = (Barang) oi.readObject();
			Barang brg2 = (Barang) oi.readObject();
			Barang brg3 = (Barang) oi.readObject();
			
			System.out.println(brg1.toString());
			System.out.println(brg2.toString());
			System.out.println(brg3.toString());
			
			oi.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Gaada filenya");
		} catch (IOException e) {
			System.out.println("Gabisa diinisiasi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
