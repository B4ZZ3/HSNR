package fileNotFound;

import java.io.*;

public class FileTest4 {
  private String file;
  private FileInputStream input;
  
  public FileTest4(String file) {
    this.file = file;
  }
  
  public void open() throws FileNotFoundException {
    input = new FileInputStream(file);
  }

  public static void main(String[] args) {
    FileTest4 f = new FileTest4("eingabe.txt");
    try {
      f.open();
    }
    catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Hier geht's weiter");
  }
}
