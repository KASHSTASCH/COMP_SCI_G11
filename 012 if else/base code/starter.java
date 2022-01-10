import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int a;
	a = sc.nextInt();
	int b;
	b = 1;
	int rand_a = rand.nextInt(100+b);
	if(rand_a==a)
	{
		System.out.println("you did it yay :)");
	}
	else
	{
		System.out.println("you are a scrotum");
	}
	
	}
}
