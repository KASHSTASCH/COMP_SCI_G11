import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
Ascii f = new Ascii();
f.printArt();
Ascii h = new Ascii("dog");
h.printArt();
Ascii y = new Ascii("Cactus", "paul");
y.printArt();
Ascii sand = new Ascii("other",3);
sand.printArt();
Ascii which = new Ascii("Sandwhich","Ham and Cheese",4);
which.printArt();
		
	}
}
