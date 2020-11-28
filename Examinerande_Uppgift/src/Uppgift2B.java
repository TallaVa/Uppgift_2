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
        String mem;             // håller ett minne av uppdelningen.
        double number;          // håller sedan värdet i double format.
        double stor = 0.0;      // håller det största värdet.
        double liten = 0.0;     // håller det minsta värdet.
               
               
        // Nedan ersätter du *** med filens adress. 
        // innan programmet kan söka igenom filen.
        File file = new File("***");                // Ersätt *** med filens adress.

        Scanner inputFile = new Scanner(file);      // Skapar scanner som skannar filen.
        inputFile.useDelimiter(";");                // Använder oss av en Delimiter som är satt på ";".
        mem = inputFile.next();                     // Variabel som håller det som läsese över fårn filen.
        number = Double.parseDouble(mem);           // Omvandlar till double.
        stor = number;                              // Data sparas på två variabler Stor och Liten.
        liten = number;

        // Loop för att utgöra vilken data är störst och vilken är minst.
        // If satser för att utesluta absolut minsta och största från filen.
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

            /* Om man vill se prossesen så ta bort den här kommentaren.
           System.out.println("Största: " + stor + " minsta: " + liten);
           */
            }
         
        // Printar ut resultatet.
        System.out.println("Efter att programmet läst filen så är det "+ 
            "största talet : " + stor + " och det minsta : " + liten);
            
        // Stänger Fil scannern.
        inputFile.close();
     


    }
    
}
