package fileNotFound;

import java.io.*;

public class FileTest3 {
  private String file;
  private FileInputStream input;
  
  public FileTest3(String file) {
    this.file = file;
  }
  
  public void open() throws FileNotFoundException {
    input = new FileInputStream(file);
  }

  public static void main(String[] args) throws FileNotFoundException {
    FileTest3 f = new FileTest3("eingabe.txt");
    f.open();
    System.out.println("Hier geht's weiter");
  }
}
