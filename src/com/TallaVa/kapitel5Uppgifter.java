import javax.swing.*;

public class kapitel5Uppgifter 
{
    public static void main(String[] args) {
        
        /**
         * Programmet ska utföra en räkning för area 
         * ska fråga om två inputs längd + bredd
         * och ska då presentera resultatet. med hjälp av 
         * 4 metoder.
         */

         double length;  //hålla längden
         double width;  //hålla bredden
         double area;   //hålla arean 

         //getLength ska få in längden från användaren
         length = getLength();

         //getWidth ska få in bredden från användaren
         width = getWidth();

         //getArea ska få in uträkningen av längd och bredd
         area = getArea(length, width);

         //displayData ska presentera resultatet
         displayData(area);
         System.exit(0);

    }

    /**
     * getLength metoden hämtar in inmatning från 
     * användaren
     * @return skickar tillbaka värdet från användaren
     */
    public static double getLength()
    {
        String input;   //användarens input
        double length;  // minne för längden

        //läsa in längedn från användaren
        input = JOptionPane.showInputDialog("Mata in längen: ");

        //få in den till en double
        length = Double.parseDouble(input);

        //returnera värdet
        return length;
    }

    /**
     * getWidth metoden hämtar in inmatning från
     * användaren
     * @return  skickar tillbaka värdet från användaren.
     */
    public static double getWidth()
    {
        String input;   // användarens input
        double width;   // minne för bredden

        //läsa in bredden från användaren
        input = JOptionPane.showInputDialog("Mata in bredden");

        //få in den till en double
        width = Double.parseDouble(input);

        //returnera värdet
        return width;
    }
    
    /**
     * getArea metoden får in två parametrar och räknar ut arean
     * @param length värdet från användaren som ska räknas ut
     * @param width värdet från användaren som ska räknas ut 
     * @return  skickar tillbaka data med arean som värde.
     */
    public static double getArea(double length, double width)
    {
        return length * width;
    }

    /**
     * displayData metoden ska enbart visa vad de andra metoderna 
     * kommit fram till
     * @param area  skriver ut värdet i area parametern.
     */
    public static void displayData(double area)
    {
        JOptionPane.showMessageDialog(null,"Arean är = " + area);
    }
    

}
