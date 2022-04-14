package fileNotFound;

import java.io.*;

public class FileTest1 {
  private String file;
  private FileInputStream input;
  
  public FileTest1(String file) {
    this.file = file;
  }
  
  public void open() {
    input = new FileInputStream(file);
  }

  public static void main(String[] args) {
    FileTest1 f = new FileTest1("eingabe.txt");
    f.open();
    System.out.println("Hier geht's weiter");
  }
}
