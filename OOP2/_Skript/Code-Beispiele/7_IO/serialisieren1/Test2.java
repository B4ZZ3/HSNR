package serialisieren1;

import java.io.*;
import java.util.*;

public class Test2 {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("kunden.dat"));
    Vector list = (Vector) in.readObject();
    in.close();
    
    int size = list.size();
    for (int i = 0; i < size; i++) {
      Kunde k = (Kunde) list.get(i);
      System.out.println(k.getName() + "; " + k.getAdresse());
    }
  }
}
