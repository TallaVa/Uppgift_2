package com.TallaVa;

import javax.swing.JOptionPane;
//import java.util.Scanner;

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


        // Code Listing 4-10

        //Variables
        int days;           //the number of days
        double sales;       //a day's sales figure
        double totalSales;  //accumulator
        String input;       //to hold the user's input

        //get the number of days
        input = JOptionPane.showInputDialog("For how many days do you have sales" +
                                " figures");
        days = Integer.parseInt(input);

        //set the accumulator to 0.
        totalSales = 0.0;

        //get the sales figures and calculate a running total.
        for (int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog("Enter the sales " +
                    "fo day " + ": ");
            sales = Double.parseDouble(input);
            totalSales += sales;                //add sales to totalSales.
        }

        // display the total sales.
        JOptionPane.showMessageDialog(null, String.format("The sales are $%,.2f", totalSales));

        System.exit(0);
    }

}
