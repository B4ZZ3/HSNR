package fileNotFound;

import java.io.*;

public class FileTest6 {
  private String file;
  private FileInputStream input;
  
  public FileTest6(String file) {
    this.file = file;
  }
  
  public void open() throws FileNotFoundException {
    input = new FileInputStream(file);
  }

  public static void main(String[] args) throws Exception {
    try {
      FileTest6 f = new FileTest6(args[0]);
      f.open();
    }
    finally {
      System.out.println("Hier geht's weiter");
    }
  }
}
