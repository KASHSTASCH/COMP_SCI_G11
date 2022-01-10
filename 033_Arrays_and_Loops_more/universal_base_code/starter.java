import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
			Random r = new Random();
			int array = r.nextInt(150);
		int[]a = new int[51+array];
int x = 0;
int min = 100;
int max = 0;
double ave = 0;
		while(x<(array+51)){
		
			a[x] = r.nextInt(100);
			System.out.println(a[x]);
			if(min>a[x]){
				min = a[x];
			}
			if(max<a[x]){
				max = a[x];
			}
			ave = ave + a[x];
			x++;
			if(x==(array+51)){
				System.out.print("Ok well then your min is " + min + "\nAnd also your max is "+ max + "\nOh also and as well your average "+(ave/100));
			}
		}
	}
}
