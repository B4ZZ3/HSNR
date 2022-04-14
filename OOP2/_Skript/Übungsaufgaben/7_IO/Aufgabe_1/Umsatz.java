import java.io.*;
import java.util.*;

public class Umsatz {
    
    public static void main(String[] args) throws Exception {

        //Read umsatz.txt
        String inputPath = "Desktop/umsatz.txt";                //set the path to the txt-file input
        ArrayList<String> inputArray = new ArrayList<String>(); //create ArrayList for data storage

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));  //Bufferedreader for handling the file input and reading

        try {
            String inputLine = "";
            while(((inputLine = reader.readLine()) != null)) {  //get the value of the file and store it in inputLine
                if(isDoubleValue(inputLine)) {                  //check if the file value is a double
                    inputArray.add(inputLine);                  //add the value to your ArrayList
                }
            }
        }
        catch (IOException e) {                                 //catch an IOException
            System.out.println("Error: " + e.getMessage());     //print an error message
        }
        finally {
            //close the reader
            if(reader != null)                                  //always close the reader
                reader.close();
        }

        //Create liste.txt 
        String outputPath = "Desktop/liste.txt";            //set the path to the txt-file output
        File liste = new File(outputPath);                  //create new File object
        if(liste.createNewFile())                           //create the new file
            System.out.println("File created!");            
        else                                                //if already exists...
            System.err.println("File already exists");      //...show an error mesage in the console

        //Write in liste.txt
        FileWriter writer = new FileWriter(outputPath);

        //write beginning of file
        writer.write("Umsatzliste\n========\n\n");

        double sum = 0;
        for(int i = 0; i < inputArray.size(); i++) {        //iterate over the entire ArrayList
            writer.write("€ " + inputArray.get(i) + "\n");  //print each double value in the file 
            sum += Double.parseDouble(inputArray.get(i));   //add value of each double for sum
        }

        //write end of file
        writer.write("\nSumme: € " + sum);

        //close the writer
        if(writer != null)
            writer.close();
    }

    //method to check if String s is a double
    public static boolean isDoubleValue(String s) {
        try { 
            Double.parseDouble(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
}
