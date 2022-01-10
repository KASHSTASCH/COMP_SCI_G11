import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your FULL name");
	String name = sc.nextLine();
	String L = " ";
	int yeh = 0;
	int N = 0;
	for(int x = 0; x<name.length(); x++){
	L = name.substring(x,x+1);
	N = x;
	if(L.compareTo(" ") == 0){
	yeh = N;
	}
	}
    System.out.println(name.substring(yeh+1));



		
	}
}
