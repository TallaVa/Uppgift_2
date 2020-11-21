import java.io.*;
import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) throws IOException {

        /**
         * Uppgift 2 del A) skapa ett program som tar in flytande tal och printar ut
         * det. presenterar också det som är störst och det som är minst.
         */

        // Variabler
        double tal; // Variabel som ska hålla talet man matat in.
        // double stor; //Variabel som håller det största talet.
        // double liten; //Variabel som håller det minsta talet.

        // Få in de tal som användaren skrivit.
        tal = getTal();

        // Få det största och det minsta talet.
        // stor = getBig();
        // liten = getSmall();

        // Visa upp resultatet.
        // visaResults(stor, liten);
        System.exit(0);
    }

    public static double getTal()
    {
        Double listaTal = 0.0;    //Variabel för att hålla allt användaren skriver in
        Double storst = 0.0;
        Double minst = 0.0;
        double input = 0.0;
    
        //Skapa en scanner
        Scanner keyboard = new Scanner(System.in);

            //Fråga användaren efter olika tal och när användaren är nöjd
            //så ska den avsluta med en "."     
            System.out.println("skriv in ett tal : " +
                                " och avsluta med '.' ");
            input = keyboard.nextDouble();
            storst = input;
            minst = storst;

            //Loop som kollar om det finns fler inmatningar från användaren sen
            //sorterar till vi får fram största och minsta inmatningen.
            while (keyboard.hasNextDouble())
            {
                double tal = keyboard.nextDouble();
                storst = Math.max(storst, tal);
                minst = Math.min(minst, tal);
            }
        
        System.out.println("Minst är: " + minst + " " + 
            " och störst blir: " + storst);

        keyboard.close();
        
            
    return listaTal;
    }
}
