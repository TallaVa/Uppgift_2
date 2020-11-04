import java.io.*;
import java.util.*;

public class LearningChapter4 {
    public static void main(String[] args) throws Exception {
        
        
        // Uppgift 4-1
        
        /* Sum of Numbers
            användaren ska slå in ett tal mellan 1-20 och programmet ska 
            summera allt upp till det heltalet användaren valt.
    

        int number;     //Talet användaren valt
        int sum = 0;    //Minne som håller tal efter varje itteration
        int count = 0;  //Counter för att räkna antal gånger programmet ska göra en loop

        
        //Skapa Scanner
        Scanner keyboard = new Scanner(System.in);

        //Fråga användaren om ett nummer mellan 1-20
        System.out.println("Mata in ett tal mellan 1-20: ");
        number = keyboard.nextInt();
        
        //Loop där det ska loopa och addera fram till och med talet man valt sedan summera allt.
        if (number > 20 || number < 1)
             {
                 System.out.println("Du är inte i intervallet 1-20, försök igen.");
                 
             }
        else
             {
                while (count < number) 
                {
                    sum += count;
                    count++;
                }       
                System.out.println(sum + number); 
             }   
             
             System.exit(0);

             */

        // Uppgift 4-2
        
        /* Distance Traveled
             skriva en kod för att räkna längden man åkt och frågar
             användaren hur många timmar samt längd i miles man kört.
             programmet ska då presentera dessa längder efter timmar.
        */
        
        //Skapar variabler
        int speed;
        int time;
        int distance = 0;
                
        
        //Skapar en scanner.
        Scanner keyboard = new Scanner(System.in);

        //Fråga användaren efter hastighet
        System.out.println("Vad har din hastighet varit?: ");
        speed = keyboard.nextInt();

        //fråga användaren efter tid.
        System.out.println("Hur många timmar har du kört ?: ");
        time = keyboard.nextInt();
      
        //Tilldela hastighet till distance.
        distance = speed;
        
        //Skapa en variabel för att räkna loops med.
        int i = 1;     

        // Loop för att få ut en lista på miles kört. i en lista med timmar.
        while(i <= time)
        {
            System.out.println("Hour\t\t Distance Traveled");
            System.out.println("----------------------------------");
            System.out.println(i +" h" + "\t\t" + distance + " miles");
            System.out.println();   //En extra rad för att se bättre ut i utskrift
            i++;
            distance += speed;            

        }

       
        System.exit(0);
        keyboard.close();
       
        


    }


        

    
    
}
