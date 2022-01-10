import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your FULL name");
	String name = sc.nextLine();
	String L = " ";
	String[] rearranged = new String[name.length()];
	
	int yeh = 0;
	int counter = 0;
	
	for(int x = name.length()-1; x>=1; x--){
	L = name.substring(x-1,x);


	if(L.compareTo(" ") == 0){
		
		rearranged[yeh] = name.substring(x, x+counter+1);
		System.out.print(rearranged[yeh] + " ");
				yeh++;
		counter = 0;
	}else{
		counter++;
	}

	}
System.out.println(name.substring(0,name.indexOf(" ", 0)));   



		
	}
}
