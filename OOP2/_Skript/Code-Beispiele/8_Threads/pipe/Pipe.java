package pipe;
 
public class Pipe
{
   private int[] array = new int [3];
   private int index = 0;

   public synchronized void write (int i)
   {
      if (index == array.length) // Falls Array Grenze erreicht, 
      {                          // Thread anhalten
         System.out.println ("Schreibender Thread muss warten"); 

         try
         {
            this.wait();
         }
         catch (InterruptedException e)
         {
         }
      }

      array [index] = i; // Wert in Array speichern
      index++;

      if (index == 1)    // Einen eventuell wartenden
         this.notify();  // Leser aufwecken

      System.out.println ("Geschrieben: " + i);
   }

   public synchronized int read()
   {
      int value;

      if (index == 0) // Falls kein Wert vorhanden,
      {               // Thread anhalten
         System.out.println ("Lesender Thread muss warten");

         try
         {
            this.wait();
         }
         catch (InterruptedException e)
         {
         }
      }

      value = array [0]; // Wert auslesen
      index--;

      for (int i = 0; i < index; i++)
         array [i] = array [i + 1]; 

      if (index == array.length - 1) // Einen eventuell wartenden 
         this.notify();              // Schreiber aufwecken

      System.out.println ("Empfangen: " + value);
      return value;
   }
}
