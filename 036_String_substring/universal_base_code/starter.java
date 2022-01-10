import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("Give a Poor Computer a Word");
String word = sc.nextLine();
for(int x = 0; x<word.length(); x++){
	System.out.println(x + 1 + " "+ word.substring(x,x+1));
}

		
	}
}
