import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_a = rand.nextInt(10);
		System.out.println(rand_a);
		double rand_b = rand.nextDouble();
		System.out.println(rand_b);
		double rand_c = rand.nextDouble();
		double a;
		a = 2.5;
		System.out.println(rand_c+a);
		int rand_d = rand.nextInt(100);
		int b;
		b = 1;
		System.out.println(rand_d+b);
		int rand_e = rand.nextInt(575);
		int c;
		c = 14;
		System.out.println(rand_e+c);
		
		
	}
}
