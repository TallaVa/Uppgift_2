package com.TallaVa;

import javax.swing.JOptionPane;

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

        // CheckPoint 4.5


        String input;
        char answer;

        input = JOptionPane.showInputDialog("Write 'Y', 'y', 'N' or 'n' : ");
        answer = input.charAt(0);

        while ((answer != 'Y') || (answer != 'y'))
        {
            input = JOptionPane.showInputDialog("this is not the right character please try again: ");
            answer = input.charAt(0);

        }

        JOptionPane.showMessageDialog(null, " You answerd :" +answer +" wich is correct");

        System.exit(0);
    }

}
