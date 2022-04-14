import java.util.*;

// reference to Date is ambiguous
//import java.sql.*;

public class ImportTest4 {
  public static void main(String[] args) {
    Date datum = new Date();
    System.out.println(datum);
    
    java.sql.Date datum2 = new java.sql.Date(System.currentTimeMillis());
    System.out.println(datum2);
  }
}
