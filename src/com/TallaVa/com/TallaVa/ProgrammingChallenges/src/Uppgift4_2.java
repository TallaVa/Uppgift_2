package com.TallaVa.ProgrammingChallenges.src;

import java.io.IOException;

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

    public static double timesTen(double number)
    {
        return number * 10.0;
    }

    public static void displayMessage(double total)
    {
        // visar totalen
        JOptionPane.showMessageDialog(null, "Det totala blir " + total);

    }

}
