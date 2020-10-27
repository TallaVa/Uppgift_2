import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Uppgift21 {
    
    public static void main(String[] args) throws IOException {
    
        //öppna fil och läser första raden.
        File file = new File("MyName.txt");
        Scanner inputFile = new Scanner(file);


        //Läs första raden
        String line = inputFile.nextLine();

        //Visa det som scannern har läst från filen MyName.txt
        System.out.println("Första raden från filen är: ");
        System.out.println(line);

        //Stänga filen 
        inputFile.close();

        
    }
}
