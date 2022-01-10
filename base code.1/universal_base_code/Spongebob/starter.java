import pkg.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
		String L = " ";
		int N = 0;
		//creating File instance to reference text file in Java
        File text = new File("./test.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner sc = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            for(int x = 0; x<line.length(); x++){
	L = line.substring(x,x+1);
	if(L.compareTo(" ") == 0){
		System.out.print(L);
		
	}
	else if(N%2 ==0){
		System.out.print(L.toUpperCase());
		N++;
	}
	else{
		System.out.print(L.toLowerCase());
		N++;
	}   }      
System.out.println(" ");
		
	}
}
}
