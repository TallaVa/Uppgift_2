import javax.swing.JOptionPane;

public class LearningChapter5 {
    
    public static void main(String [] args ){

        
        /** Test av en CodeListning 5-3 där vi använder oss av två void metoder 

        double salary;      // lön
        int creditRating;   //Credit rating
        String input;       // användarens inslag
        
        // få in användarens lön
        input = JOptionPane.showInputDialog("vad har du för lön?: ");
        salary = Double.parseDouble(input);

        // få in användarens credit rating ( 1 till 10)
        input = JOptionPane.showInputDialog("på en skala mellan 1 till 10 " +
                                            " vad har du för credit värdighet ?: " +
                                            " 1 = dåligt och 10 = utmärkt. ");
        creditRating = Integer.parseInt(input);

        // Loop som kollar om man är vädrig att få credit kort
        if (salary >= 20000 && creditRating >= 7)
            qualify();
        else
            noQualify();
        
        System.exit(0);
        */

    

    /**
     * Metoden qualify informerar om man kan ta ut ett 
     * credit kort.
     

     public static void qualify()
     {
         JOptionPane.showMessageDialog(null, "Grattis !! du kvalifiseras för ett creditkort");
     }

     /**
      * Metoden noQualify informerar om att de inte kan ta ut ett 
      * kredit kort
      

      public static void noQualify()
      {
          JOptionPane.showMessageDialog(null, "Sorry du kvalifeceras inte för ett credit kort.");
      }
      */
    
      /**Test av " only a copy of an argument
       * is passed into a method."
       */

       /*
        int number = 99;

        // display the value in number.
        System.out.println("number is " + number);

        //Call changeMe, passing the value in number
        // as an argument.
        changeMe(number);

        //Display the value in number again.
        System.out.println("number is " + number);
        
    }

      /**
       * The changeMe method accepts an argumet and then
       * changes the value of the parameter.
       */
      /*
       public static void changeMe(int myValue)
       {
           System.out.println("I am changing the value.");

           //Change the myValue parameter cariable to 0.
           myValue = 0;

           //Display the value in myValue.
           System.out.println("Now the value is " + myValue);
           */




           

    }
   
    

    
}
