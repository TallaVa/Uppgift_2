import java.io.*;
import java.util.Scanner;

public class Uppgift2B 
{
    public static void main (String [] args) throws IOException
    {

        /**
         * Uppgift B
         * Med en texteditor, t ex Notepad/Anteckningar, skapa en textfil som innehåller en serie flyttal 
         * separerade med semikolon t ex: 3.455;1.67;83.98;0.1;23.178. Läs in textfilen och låt 
         * applikationen avgöra vilket tal som var störst och vilket som var minst.
         */

        // Skapa en skanner
         Scanner keyboard = new Scanner(System.in);

         

        // Skapa filen som ska hålla användarens inmatning
        PrintWriter outputFile = new PrintWriter("Tal2.txt");

        outputFile.println("3.455;1.67;83.98;0.1;23.178");

        File file = new File("tal2");
        Scanner inputFile = new Scanner(file);

        //Read the file
        String line = inputFile.nextLine();

        System.out.println(line);
        

        outputFile.close();
        inputFile.close();
        keyboard.close();


    }
    
}
