package serialisieren1;

import java.io.*;
import java.util.*;

public class Test1 {
  public static void main(String[] args) throws Exception {
    Kunde k1 = new Kunde("Meier, Hugo", "Hauptstr. 12, 40880 Ratingen");
    Kunde k2 = new Kunde("Schmitz, Otto", "Dorfstr. 5, 40880 Ratingen");
    
	Vector kunden = new Vector(); // Vector implementiert Serializable
    kunden.add(k1);
    kunden.add(k2);
    
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kunden.dat"));
    out.writeObject(kunden);
    out.flush();
    out.close();
  }
}
