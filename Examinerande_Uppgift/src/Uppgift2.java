import java.util.Scanner;

public class Uppgift2 
{
    public static void main(String[] args) 
    {

        /**
         * Uppgift 2 del C) skapa ett program som tar in flytande tal och printar ut
         * det. presenterar också det som är störst och det som är minst.
         */

        // Variabler
        double tal;         // Variabel som ska hålla talet man matat in.
        double stor;        // Variabel som håller det största talet.
        double liten;       // Variabel som håller det minsta talet.     
        double input;       // Variabel som håller inmatningen från användaren
    
        // Skapa en scanner
        Scanner keyboard = new Scanner(System.in);
        

            // Fråga användaren efter olika tal och när användaren är nöjd
            // så ska den avsluta med en "."     
            System.out.println("skriv in vilka tal du vill tills du är nöjd, enter efter varje inmatning " +
                                " och avsluta med '.'");
            input = keyboard.nextDouble();
            stor = input;
            liten = stor;

            // Loop som kollar om det finns fler inmatningar från användaren sen
            // sorterar tills vi får fram största och minsta inmatningen.                        
            while (keyboard.hasNextDouble())
            {
                tal = keyboard.nextDouble();
                stor = Math.max(stor, tal);
                liten = Math.min(liten, tal);
            }
        
        // Här printar vi ut resultatet
        System.out.println("Minst är: " + liten + " " + 
            " och störst blir: " + stor);
        
        //Stänger Scannern.
        keyboard.close();

    }
}