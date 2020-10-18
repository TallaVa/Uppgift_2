package com.TallaVa;

import javax.swing.JOptionPane;
//import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class FromTheBook {

    public static void main(String [] args) throws IOException {

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


        /* Code Listing 4-10

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

         */

        /* Code Listing 4-11
        // Test av Sentinel Value

        int points;
        int totalPoints = 0;

        //Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Display general instructions.
        System.out.println("Enter the number of points your team\n" +
                "has earned for each game this season.\n" +
                "Enter -1 when finished.");

        //Get the first number of points.
        System.out.print("Enter game points or -1 to end: ");
        points = keyboard.nextInt();

        //Accumulate the points until -1 is entered.
        while (points != -1)
        {
            //Add ponts to totalPoints.
            totalPoints += points;

            //Get the next number of points.
            System.out.print("Enter game points or -1 to end: ");
            points = keyboard.nextInt();
        }

        //Display the total number of points.
        System.out.println("The total points are "+ totalPoints);

         */

        //CheckPoint

            /* 4.13
            int number;         //Store the number taken by the user
            int totalNumber = 0;    //Store the totalSum

            //Create new scanner
            Scanner keyboard = new Scanner(System.in);

            //Ask the user for a number.
            System.out.println("Enter a number: ");
            number = keyboard.nextInt();

            for (int count = 1; count < 7; count++)
            {
                System.out.println("Enter a number: ");
                number = keyboard.nextInt();
                //Add points to totalSum
                totalNumber += number;

            }

            System.out.print("The total sum is: " + totalNumber);

            System.exit(0);

             */
        //The Clock program

        /* simulate the clock
            for (int hours = 1; hours <= 1; hours++)
            {
                for (int minutes = 0; minutes <= 10; minutes ++)
                {
                    for (int seconds = 0; seconds <= 20; seconds ++)
                    {
                        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                    }
                }
            }

         

        //Code Listing 4.13
        
        int numStudents,        //number of students
                numTests,       //number of tests per stdents
                score,          //test score
                total;          //accumulator for test score
        double average;         //average test score

        //Create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Get the number of students.
        System.out.println("How many students do you have? ");
        numStudents = keyboard.nextInt();

        //get the numer of test scores per student.
        System.out.print("How many testscores per student? ");
        numTests = keyboard.nextInt();

        //Process all the students.
        for (int student = 1; student <= numStudents; student++)
        {
            total = 0;  // Set the accumulator to zero.

            //get the test scores for a student.
            System.out.println("Student number " + student);
            System.out.println("------------------");
            for (int test = 1; test <= numTests; test++)
            {
                System.out.print("Enter score " + test + ": ");
                score = keyboard.nextInt();
                total += score; // add score to total.
            }

            //Calculate and display the average.
            average = total / numTests;
            System.out.printf("The average for student %d is %.1f.\n\n", student, average);
        }
        
        
        int rows, cols;

        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Get the number of rows and colums.
        System.out.print("How many rows? ");
        rows = keyboard.nextInt();

        System.out.print("How many colums? ");
        cols = keyboard.nextInt();

        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < (r+1); c++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
*/
        //Test file writer .
        /*
        String filename;
        filename = JOptionPane.showInputDialog("Enter the filename.");
        PrintWriter outputFile = new PrintWriter(filename);
        outputFile.println("behram");
        outputFile.close();
    */

    // Code Listing 4-17

        String filename;    //File name
        String friendName;  //Friend's name
        int numFriends;     //Number of friends

        //Create a scanner
        Scanner keyboard = new Scanner(System.in);

        //Consume the remaining newline character.
        keyboard.nextLine();
        
        //Get the filename.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        //Open the file.
        PrintWriter outputFile = new PrintWriter(filename);

        //Get data and write it to file.
        for (int i = 1; i <= numFriends; i++)
        {
            //Get the name of a friend.
            System.out.print("Enter the name of firend number" + i + ": ");
            friendName = keyboard.nextLine();

            //Write the name to the file.
            outputFile.println(friendName);
        }

        //Close the file.
        outputFile.close();
        System.out.println("Data written to the file.");
    }

}
