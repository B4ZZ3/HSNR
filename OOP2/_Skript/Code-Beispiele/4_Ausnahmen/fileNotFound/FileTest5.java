package fileNotFound;

import java.io.*;

public class FileTest5 {
  private String file;
  private FileInputStream input;
  
  public FileTest5(String file) {
    this.file = file;
  }
  
  public void open() throws FileNotFoundException {
    input = new FileInputStream(file);
  }

  public static void main(String[] args) {
    try {
      FileTest5 f = new FileTest5(args[0]);
      f.open();
    }
    catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Hier geht's weiter");
  }
}
