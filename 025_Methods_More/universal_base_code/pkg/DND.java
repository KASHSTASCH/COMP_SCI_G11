package pkg;
import java.util.Scanner;
import java.util.Random;


public class DND {
public String a;
public int intel;
public int dex;
public int chari;
public int stre;
public int cont;


public static void myToString(String d){
			System.out.println("No role");
	System.out.print("Dexterity   ");
System.out.println("0");
System.out.print("Constitituition   ");
System.out.println("0");
System.out.print("Intelegince   ");
System.out.println("0");
System.out.print("Stength   ");
System.out.println("0");
System.out.print("Charisma   ");
System.out.println("0");
System.out.println();
System.out.println("-----------------------------------------------------------");
System.out.println();
System.out.println("Choose your class \nWizard, Warrior, Rogue");
}

	public void errors(String c){
		Scanner	sc = new Scanner(System.in);
	
		a = c;
	
		if(a.equals("rogue") || a.equals("Rogue")){
			System.out.println("U gon be one speedy boi");
			
		}
		else if(a.equals("warrior") || a.equals("Warrior")){
			System.out.println("Axe go chop chop");
			
		}
			else if(a.equals("Wizard") || a.equals("wizard")){
			System.out.println("Big smart");
			
		}
		else{
			System.out.println("no role");
		}
		
	}
	public void Stats(int intel1,int dex1,int chari1,int stre1,int cont1){
		stre = stre1;
		dex = dex1;
		chari = chari1;
		cont = cont1;
		intel = intel1;
		System.out.println("Your Strength is "+ stre);
			System.out.println("Your Strength is "+ dex);
				System.out.print("Your Strength is "+ chari);
					System.out.print("Your Strength is "+ intel);
						System.out.print("Your Strength is "+ cont);
		
	}
	
	
}

