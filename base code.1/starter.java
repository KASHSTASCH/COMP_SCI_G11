import java.util.Scanner;

public class Lab0307
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        double base, height, area;

        System.out.println("Please input the base.");
        try
        {
            base = input.nextDouble();
        }
        catch (Exception e)
        {
            System.out.println("An exception was thrown of type " 
                + e + ". Please give a number.");
            input.next(); // flush the bad token
            base = input.nextDouble();
        }

        System.out.println("Please input the height.");
        try
        {
            height = input.nextDouble();
        }
        catch (Exception e)
        {
            System.out.println("An exception was thrown of type " 
                + e + ". Please give a number.");
            input.next(); // flush the bad token
            height = input.nextDouble();
        }

        area = 0.5 baseheight;

        System.out.println("Area of a Triangle\n");
        System.out.print ("The triangle with a base of " + base);
        System.out.println (" and a height of " + height);
        System.out.println(" has an area of "  + area + ".");
   } 

}