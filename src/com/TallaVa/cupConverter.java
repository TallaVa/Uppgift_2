import javax.swing.JOptionPane;

public class cupConverter
 {

    public static void main(String[] args)
    {
        double cups;    // hålla antal cups.
        double ounces;  //hålla nummret för antal ounces.

        //få antal cups
        cups = getCups();

        //convertera cups till ounces i vätska.
        ounces = cupsToOunces(cups);

        //visa resultat.
        displayResults(cups, ounces);
        System.exit(0);
    }

    /**
     * Metoden getCups promtar användaren att ange
     * antal cups.
     * @return antal cups användaren anget.
     */

     public static double getCups()
     {
         String input;      //hålla inslag av användaren.
         double numCups;    //hålla antal cups.

         // gå antal cups från användaren.
         input = JOptionPane.showInputDialog("This program converts measurments\n" +
                "in cups to fluid ounces. fot your\n" + 
                " reference the formula is: \n" + 
                "   1 cup = 8 fluid ounces\n" + 
                "Enter the number of cups.");
                
        //konverterar inmatningen till en double.
        numCups = Double.parseDouble(input);

        //Return skickar tillbaka nummer av cups.
        return numCups;
     }

     /**
      * cupsToOunces metoden gör om cups till Ounces i vätska, med 
      * formeln 1cup = 8 ounces.
      * @param numCups antal cups att göra om
      * @return numer av ounces.
      */

      public static double cupsToOunces(double numCups)
      {
          return numCups * 8.0;
      }

      /**
       * displayResults metoden visar meddelande 
       * med resultatet av uträkningen.
       * @param cups antal cups.
       * @param ounces antal ounces.
       */

       public static void displayResults(double cups, double ounces)
       {
           //visar antal ounces.
           JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces + 
                " fluid ounces.");
       }
}
