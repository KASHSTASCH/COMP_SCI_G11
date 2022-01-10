import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below her
		Scanner sc =  new Scanner(System.in);
		System.out.println("Say your name");
		String name = sc.nextLine();
		System.out.println("How many times do you want it to be said");
		int b = sc.nextInt();
		int c;
		c = 0;
		while(true)
		{
		 System.out.println(name);
		 if(c==b)
		 {
		 	break;
		 }
		 c = c + 1;
		 
		}



		
	}
}
