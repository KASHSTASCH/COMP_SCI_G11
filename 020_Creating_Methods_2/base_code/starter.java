import java.util.Scanner;
import java.util.Random;

class starter {
	public static void pow(int a,int b){
	System.out.print("Your number is "+Math.pow(a,b));
	}
	
	
	
	
	
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Pick a number");
	int a = sc.nextInt();
	System.out.println("What about one more");
	int b = sc.nextInt();
	pow(a,b);
	}
}
