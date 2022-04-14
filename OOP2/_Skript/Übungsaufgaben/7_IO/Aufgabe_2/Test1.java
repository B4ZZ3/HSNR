package Aufgabe_02;

import java.io.*;
import java.util.*;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		Konto k1 = new Konto(1234, 500);
		Konto k2 = new Konto(5678, 2000);
				
		Vector<Konto> konten = new Vector<Konto>();
		konten.add(k1);
		konten.add(k2);
			
	DataOutputStream data = new DataOutputStream(new FileOutputStream("konten.txt", true));
	
	for(int i = 0; i<konten.size(); i++) {
		
//	data.writeUTF(konten.get(i).toString());
	
	data.writeInt(konten.get(i).getKontonummer());
	data.writeDouble(konten.get(i).getSaldo());
	}
	
	System.out.println("All Data were written.");	
	
	data.flush(); //forces any buffered output bytes to be written out to the stream
	data.close();
		
	}
}
