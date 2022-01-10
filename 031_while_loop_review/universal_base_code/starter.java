import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int x = 0;
		int[] rand_a = new int[20];
		while(x<20){
		rand_a[x] = rand.nextInt(50);
		System.out.println(rand_a[x]);
		x++;
		}
		System.out.println("Yeeee");
		int y = 19;
			while(y>-1){
		rand_a[y] = rand.nextInt(50);
		System.out.println(rand_a[y]);
		y--;
	
		}
	}
}
