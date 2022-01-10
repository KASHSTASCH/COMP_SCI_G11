import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
		int a;
	a = 1;
	int rand_a = rand.nextInt(1000+a);
	while(true)
	{
	
	System.out.print("Try and guess the number between 1-1000:  ");
int b = sc.nextInt();
System.out.println(" ");
	
	if(b < rand_a)
	{
System.out.println("To low");
System.out.println();

	}
		if(b > rand_a)
	{
System.out.println("To high");
System.out.println();

	}
	
	if(b == rand_a)	
	{
		
		System.out.println("Yay you did it");
		break;
	}
	{
	

	}
	}
}
}
