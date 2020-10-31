import java.util.*;

public class LearningChapter4 {
    public static void main(String[] args) throws Exception {
        
        
        // Uppgift 4-1
        
        /* Sum of Numbers
            användaren ska slå in ett tal mellan 1-20 och programmet ska 
            summera allt upp till det heltalet användaren valt.
        */

        int number;     //Talet användaren valt
        int sum = 0;        //Minne som håller tal efter varje itteration
        int count = 0;

        
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

    }


        

    
    
}
