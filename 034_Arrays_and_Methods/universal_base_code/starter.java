import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[]a = new int[100];
		int x = 0;
		while(x<100){
			Random r = new Random();
			a[x] = (r.nextInt(100)+1);
		
			x++;
		}
toStringArray(a);
System.out.println("---------------------------------------------------------------------");
getArrayAverage(a);
getArrayMax(a);
getArrayMin(a);
	}

	public static void toStringArray(int[]a){
		int b = 0;
		while(b<100){
			System.out.println(a[b]);
			b++;
		}
		return;
	}
	public static void getArrayAverage(int[]a){
		int number = 0;
		double total = 0;
		while(number<100){
		total =	a[number] +  total;
			number++;
		}
		System.out.println("Your Average is " + total/100);
		
	}
	public static void getArrayMax(int[]a){
		int paul = 0;
		int paul1 = 0;
		int jim = 0;
		while(jim<100){
		if(a[jim]>paul){
			paul = a[jim];
			paul1 = jim;
		}
		jim++;
		}
		System.out.println("Yout max number is "+paul+ " at index "+paul1);
	}
	public static void getArrayMin(int[]a){
		int paul = 100;
		int paul1 = 0;
		int jim = 0;
		while(jim<100){
		if(a[jim]<paul){
			paul = a[jim];
			paul1 = jim;
		}
		jim++;
		}
		System.out.println("Yout min number is "+paul+ " at index "+paul1);
	}
	

}