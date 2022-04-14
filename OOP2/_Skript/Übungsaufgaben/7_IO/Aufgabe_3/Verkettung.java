import java.io.*;

public class Verkettung {
    public static void main(String args[]) throws IOException {
        String endPath = "endPath.txt";
        String [] startPaths = {"text1.txt", "text2.txt", "text3.txt"};
        String combinedText = "";

        PrintWriter output = new PrintWriter(new FileWriter(endPath));

        for (int i = 0; i < startPaths.length; i++) {

            BufferedReader input = new BufferedReader(new FileReader(startPaths[i]));
            
            while((combinedText = input.readLine()) != null) {
                output.print(combinedText); //println
            }

            input.close();
            output.println(); //Zeilenumbruch
        }

        output.close();
    }
}
