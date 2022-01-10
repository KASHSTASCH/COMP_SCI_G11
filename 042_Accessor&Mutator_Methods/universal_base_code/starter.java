import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

	for(int zen = 0; zen<100; zen++){
	dwarf b = new dwarf();
	b.setName();
	b.setAge();
	System.out.print("Hi I'm "+b.getName()+" ");
	System.out.println("and I'm "+b.getAge()+" years old");
}
		
	}
}
class dwarf {
	String name;
	int age;
 //	public String setName(){
//		name = "";
//		return name;
//	}
///	public int setAge(){
//		age = 0;
//		return age;
//	}
	public void setAge(){
	Random r = new Random();
	age = r.nextInt(100)+1;
	
	}
	public int getAge(){
		return age;
	}
	public void setName(){
		Random r = new Random();
	String[]ok = new String[7];
	ok[0] ="dopey";
	ok[1] ="doc";
	ok[2] ="sleepy";
	ok[3] ="happy";
	ok[4] ="bashful";
	ok[5] ="sneezy";
	ok[6] ="grumpy";
	int y = r.nextInt(7);
	int h = 0;
	while(true){
		if(y == h){
		name = ok[h];
		break;
		}
		h++;
	}
	}
	public String getName(){
	return name;	
	}
}