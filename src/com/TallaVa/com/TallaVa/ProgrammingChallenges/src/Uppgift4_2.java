package com.TallaVa.ProgrammingChallenges.src;

import javax.swing.JOptionPane;

public class Uppgift4_2 {
    
    public static void main(String[] args)
    {
      
        double number;     // håller numer 
        double total;      // minne 

        // få nummer från användaren
        number = getNumber();

        // Räkna ut 
        total = timesTen(number);

        //presentera
        displayMessage(total);
        System.exit(0);
               
    }
    /**I get Number metoden så läser vi in vad
     * användaren matar in och sparar det i number
     * @return number skickar tillbaka värdet
     */
    
    public static double getNumber()
    {
        String input;   //användarens input
        double number;  // hålla nummret
    // läs in numret
    input = JOptionPane.showInputDialog("Lägg in ett tal: ");
        
    //konverterar inmatningen till en double.
    number = Double.parseDouble(input);

    //returnera resultatet
    return number;
    
    }

    /**
     * Metoden timesTen räknar ut ekvationen och tilldelar
     * number ett värde
     * @param number håller värder som ska in i ekvationen
     * @return  returnerar värdet efter ekvationen till metoden
     */

    public static double timesTen(double number)
    {
        return number * 10.0;
    }

    /**
     * Metoden displayMessage ska vissa resultatet
     * @param total är en parameter som kommer att visa
     * slutresultatet efter ekvationen
     */

    public static void displayMessage(double total)
    {
        // visar totalen
        JOptionPane.showMessageDialog(null, "Det totala blir " + total);

    }

}
