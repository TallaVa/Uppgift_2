import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Uppgift2C {
    public static void main(String[] args) throws FileNotFoundException 
        {

            /**
             * Uppgift 2 del C) skapa ett program som tar in flytande tal och printar ut
             * det. presenterar också det som är störst och det som är minst.
             * VG . tilläg är att det skapas en fil med användarens inmatning
             * och resultat.
             */

            // Variabler
            double tal;         // Variabel som ska hålla talet man matat in.
            double stor;        // Variabel som håller det största talet.
            double liten;       // Variabel som håller det minsta talet.     
            double input;       // Variabel som håller inmatningen från användaren
        
            // Skapa en scanner
            Scanner keyboard = new Scanner(System.in);

            // Skapa filen allt ska exporteras till
            PrintWriter utData = new PrintWriter("utData.txt");

                // Fråga användaren efter olika tal och när användaren är nöjd
                // så ska den avsluta med en "."    
                // Användar indata kommer att printas till filen utData.txt. 
                System.out.println("skriv in vilka tal du vill tills du är nöjd, enter efter varje inmatning " +
                                    " och avsluta med '.'");
                input = keyboard.nextDouble();
                utData.println("Användar input: " + input);
                stor = input;
                liten = stor;

                // Loop som kollar om det finns fler inmatningar från användaren sen
                // sorterar tills vi får fram största och minsta inmatningen.  
                // Tilläg är då att utData printar ut allt som användaren matar in till en fil                      
                while (keyboard.hasNextDouble())
                {
                    tal = keyboard.nextDouble();
                    utData.println("Användar input: " + tal);
                    stor = Math.max(stor, tal);
                    liten = Math.min(liten, tal);
                }
            
            // Här printar vi ut resultatet
            System.out.println("Minst är: " + liten + " " + 
                " och störst blir: " + stor);

            // Och printar ut det till samma fil.
            utData.println("Störst: " + stor);
            utData.println("Minst: " + liten);
            
            //Stänger Scannern och filen.
            keyboard.close();
            utData.close();

    }
}