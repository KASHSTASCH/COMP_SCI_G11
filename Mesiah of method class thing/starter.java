import java.util.Scanner;
import java.util.Random;

class cat{
String name;

public cat(){
	name = new String("garfield");
}
public cat(String a){
	name = a;

}
public void meow(){
	System.out .println("The cat "+name+" Meows");
	return;
}

}
class starter{
	public static void main(String ags[]){
		cat a = new cat();
		a.meow();
		cat b = new cat("confusion");
		b.meow();
		
	}
}