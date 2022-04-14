package fileNotFound;

import java.io.*;

public class FileTest2 {
  private String file;
  private FileInputStream input;
  
  public FileTest2(String file) {
    this.file = file;
  }
  
  public void open() throws FileNotFoundException {
    input = new FileInputStream(file);
  }

  public static void main(String[] args) {
    FileTest2 f = new FileTest2("eingabe.txt");
    f.open();
    System.out.println("Hier geht's weiter");
  }
}
