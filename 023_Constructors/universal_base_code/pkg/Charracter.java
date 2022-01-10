package pkg;
import java.util.Scanner;
import java.util.Random;

public class Charracter {
	public String a;
	public int dex;
	public int con;
	public int intel;
	public int stre;
	public int chari;
	
	
	public Charracter() {
	a = "no role";
}
public Charracter(String c){
	a = c;
		Scanner sc = new Scanner (System.in);
		int z = 0;
		int x = 0;
		int y = 0;
		int w = 0;
		int v= 0;
		int aa;
		aa = 25;
		int bb;
		bb = 0;
		int cc = 10;

if (a.equals("Rogue") || a.equals("rogue"))
	{
		System.out.println("Roguer that");
			System.out.println("Now you may select your skills");
		System.out.println("But be warned you will only have 25 points");
		while(true){
				System.out.println("First you may choose how many poinits you will put into Strength");
		z = sc.nextInt();
	
		if(cc>=z){
			System.out.print("You have ");
		System.out.print(aa-z);
		System.out.println(" points remaining");
		break;
		}
		}
			while(true){
				System.out.println("Now you may choose your Dexterity");
		y = sc.nextInt();
	
		if(cc>=y){
			System.out.print("You have ");
		System.out.print(aa-(y+z));

		System.out.println(" points remaining");
		break;
		}
		}
				while(true){
				System.out.println("Followed by your Intelligence");
		w = sc.nextInt();
	
		if((cc>=w) && (aa>=(y+z+w)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+w));

		System.out.println(" points remaining");
		break;
		}
		}
			while(true){
				System.out.println("Followed by your Constititution");
		x = sc.nextInt();
	
	if((cc>=x) && (aa>=(y+z+w+x)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+x+w));

		System.out.println(" points remaining");
		break;
		}
			}
					while(true){
				System.out.println("Finally your Charisma");
		v = sc.nextInt();
	
		if((cc>=v) && (aa>=(y+z+w+x+v)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+x+w+v));

		System.out.println(" points remaining");
			System.out.print("Strength  ");
		System.out.println(z);
		System.out.print("Dexterity  ");
		System.out.println(y);
		System.out.print("Intelegence  ");
		System.out.println(w);
		System.out.print("Constititution  ");
		System.out.println(x);
		System.out.print("Charisma  ");
		System.out.println(v);
		break;
		}
	
			}
		}
			else if(a.equals("Warrior") || a.equals("warrior"))
	{
		System.out.println("Your a Warrior harry just doesnt roll off the tongue");
		System.out.println("Now you may select your skills");
		System.out.println("But be warned you will only have 25 points");
			while(true){
				System.out.println("First you may choose how many poinits you will put into Strength");
		z = sc.nextInt();
	
		if(cc>=z){
			System.out.print("You have ");
		System.out.print(aa-z);
		System.out.println(" points remaining");
		break;
		}
		}
			while(true){
				System.out.println("Now you may choose your Dexterity");
		y = sc.nextInt();
	
		if(cc>=y){
			System.out.print("You have ");
		System.out.print(aa-(y+z));

		System.out.println(" points remaining");
		break;
		}
		}
				while(true){
				System.out.println("Followed by your Intelligence");
		w = sc.nextInt();
	
		if((cc>=w) && (aa>=(y+z+w)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+w));

		System.out.println(" points remaining");
		break;
		}
		}
			while(true){
				System.out.println("Followed by your Constititution");
		x = sc.nextInt();
	
	if((cc>=x) && (aa>=(y+z+w+x)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+x+w));

		System.out.println(" points remaining");
		break;
		}
			}
					while(true){
				System.out.println("Finally your Charisma");
		v = sc.nextInt();
	
		if((cc>=v) && (aa>=(y+z+w+x+v)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+x+w+v));

		System.out.println(" points remaining");
			System.out.print("Strength  ");
		System.out.println(z);
		System.out.print("Dexterity  ");
		System.out.println(y);
		System.out.print("Intelegence  ");
		System.out.println(w);
		System.out.print("Constititution  ");
		System.out.println(x);
		System.out.print("Charisma  ");
		System.out.println(v);
		break;
		}
	
			}
		
	}
	else if (a.equals("Wizard") || a.equals("wizard"))
	{
		System.out.println("Your a Wizard Harry");
			System.out.println("Now you may select your skills");
		System.out.println("But be warned you will only have 25 points");
		while(true){
				System.out.println("First you may choose how many poinits you will put into Strength");
		z = sc.nextInt();
	
		if(cc>=z){
			System.out.print("You have ");
		System.out.print(aa-z);
		System.out.println(" points remaining");
		break;
		}
		}
			while(true){
				System.out.println("Now you may choose your Dexterity");
		y = sc.nextInt();
	
		if(cc>=y){
			System.out.print("You have ");
		System.out.print(aa-(y+z));

		System.out.println(" points remaining");
		break;
		}
		}
				while(true){
				System.out.println("Followed by your Intelligence");
		w = sc.nextInt();
	
		if((cc>=w) && (aa>=(y+z+w)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+w));

		System.out.println(" points remaining");
		break;
		}
		}
			while(true){
				System.out.println("Followed by your Constititution");
		x = sc.nextInt();
	
	if((cc>=x) && (aa>=(y+z+w+x)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+x+w));

		System.out.println(" points remaining");
		break;
		}
			}
					while(true){
				System.out.println("Finally your Charisma");
		v = sc.nextInt();
	
		if((cc>=v) && (aa>=(y+z+w+x+v)))
		{
			System.out.print("You have ");
		System.out.print(aa-(y+z+x+w+v));

		System.out.println(" points remaining");
			System.out.print("Strength  ");
		System.out.println(z);
		System.out.print("Dexterity  ");
		System.out.println(y);
		System.out.print("Intelegence  ");
		System.out.println(w);
		System.out.print("Constititution  ");
		System.out.println(x);
		System.out.print("Charisma  ");
		System.out.println(v);
		break;
		}
	
			}
	}
	else if(a.equals(a))
	{
		System.out.print("no role");
	}

}
}