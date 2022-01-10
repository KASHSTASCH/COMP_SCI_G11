import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
		System.out.println("Greetings Travelor welcome"); 
		System.out.println("Pick your class"); 
		System.out.println("Wizard"); 
		System.out.println("Warrior"); 
		System.out.println("Rogue"); 
		String a = sc.nextLine();
	if (a.equals("Wizard") || a.equals("wizard"))
	{
		System.out.println("Your a wizard harry");
	}
	else if(a.equals("Warrior") || a.equals("warrior"))
	{
		System.out.println("Your a Warrior harry just doesnt roll off the tongue");
	}
	else if (a.equals("Rogue") || a.equals("rogue"))
	{
		System.out.println("Yay ur a speedy boi Rogue");
	}
	else if(a.equals(a))
	{
		System.out.print("try again");
	}
	}
}
