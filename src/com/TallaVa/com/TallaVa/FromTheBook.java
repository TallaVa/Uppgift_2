package com.TallaVa;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class FromTheBook {

    public static void main(String [] args){

        // alla uppgifter inför inlämning2

        /* CheckPoint 4.4
        int number;
        String input;

        input = JOptionPane.showInputDialog("Enter a number between 10 and 24: ");
        number = Integer.parseInt(input);

        while (number <10 || number > 24)
        {
            input = JOptionPane.showInputDialog("you are not in the range. " +
                                                "please re enter a number in range: ");
            number = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null,"You have enterd: "+number);

        System.exit(0);

         */

        /* CheckPoint 4.5. CheckPoint får vi om vi ändrar "y" till "Yes"

        String input;
        Scanner keyboard;
        keyboard = new Scanner (System.in);

        System.out.println("Enter Y/N to continue: ");
        input = keyboard.next();

        while (!input.equalsIgnoreCase("y"))
        {

            while (!input.equalsIgnoreCase("n"))
            {
                System.out.println("WRONG. Try again :(");
                input = keyboard.next();
            }
            System.out.println("Program terminated");
            System.exit(0);
        }

        System.out.println("Program terminated");
        System.exit(0);

         */





    }

}
