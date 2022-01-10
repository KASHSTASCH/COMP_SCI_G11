import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[]a = new int[1000];
int x = 0;
		while(x<1000){
			Random r = new Random();
			a[x] = r.nextInt(10000000);
			System.out.println(a[x]);
			x++;
		}
		System.out.println("This is a Number" + a[398]);
	}
}
