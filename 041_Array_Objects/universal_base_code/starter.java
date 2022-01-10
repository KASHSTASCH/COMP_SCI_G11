
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Wizard[]x = new Wizard[100];
	Warrior[]y = new Warrior[100];
	
	int W = 0;
	int WA = 0;
	for(int z = 0; z<100; z++ ){
	x[z] = new Wizard();
	y[z] = new Warrior();
	x[z].attack(W);
	
	W++; 
	WA++;
	}
	

}
}

