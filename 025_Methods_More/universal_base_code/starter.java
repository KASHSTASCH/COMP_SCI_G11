import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

	DND g = new DND();
		String d = "";
	g.myToString(d);
	String c = sc.nextLine();
	g.errors(c);
	System.out.println("Pick a number");
 int intel = sc.nextInt();
 System.out.println("Pick a number");
 int dex = sc.nextInt();
 System.out.println("Pick a number");
 int chari = sc.nextInt();
 System.out.println("Pick a number");
 int stre = sc.nextInt();
 System.out.println("Pick a number");
 int cont = sc.nextInt();

 g.Stats(intel,dex,chari,stre,cont);
}
}
