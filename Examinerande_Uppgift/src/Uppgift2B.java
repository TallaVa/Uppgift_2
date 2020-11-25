import java.io.*;
import java.util.*;

public class Uppgift2B 
{
    public static void main (String [] args) throws FileNotFoundException
    {

        /**
         * Uppgift B
         * Med en texteditor, t ex Notepad/Anteckningar, skapa en textfil som innehåller en serie flyttal 
         * separerade med semikolon t ex: 3.455;1.67;83.98;0.1;23.178. Läs in textfilen och låt 
         * applikationen avgöra vilket tal som var störst och vilket som var minst.
         */

        // Variabler
        String mem; // håller ett minne av uppdelningen
        double number;  // håller sedan värdet i double format
        double stor = 0.0;
        double liten = 0.0;
               
        // Skapa en skanner
        Scanner keyboard = new Scanner(System.in);
        
        // Öppnar filen vi har skapat på skrivbordet
        File file = new File("C:\\Users\\bere\\IdeaProjects\\Uppgift_2\\Examinerande_Uppgift\\tal2.txt");
        Scanner inputFile = new Scanner(file);      // Skapar scanner som skannar filen
        inputFile.useDelimiter(";");                // Använder oss av en Dlimiter som är satt på ";"
        mem = inputFile.next();
        number = Double.parseDouble(mem);
        stor = number;
        liten = number;

       while(inputFile.hasNext())
        { 
            if( number < liten)
            {
                liten = number;
            }
            else if (number > stor)
            {
                stor = number;
            }
            mem = inputFile.next();
            number = Double.parseDouble(mem);

            System.out.println("Största: " + stor + " minsta: " + liten);
            
        }
                        
        System.out.println("Efter att programmet läst filen så är det "+ 
            "största talet : " + stor + " och det minsta : " + liten);
            
        
        inputFile.close();
        keyboard.close();


    }
    
}
