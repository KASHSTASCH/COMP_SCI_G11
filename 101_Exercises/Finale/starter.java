import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main (String args[ ]){
	int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
	int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
	int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
	int mode1 = getMode(arr1);		//The value of mode1 is 5.
	int mode2 = getMode(arr2);		//The value of mode2 is 7
	int mode3 = getMode(arr3);		// The value of mode3 is -1.

int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
int [ ] arr5 = {1, 2, 3, 4, 5, 6};
int median1 = getMedian(arr4);  	//The value of median1 is 4.
int median2 = getMedian(arr5);	//The value of median2 is 3.
}

public static int getMedian(int[]arr4){
 
 	x = arr4.length - arr4.length/2;
 return arr4;

}
public static int getMedian(int[]arr5){
 
 	x = arr5.length - arr5.length/2;
 return arr5;

}




public static int getMode(int[]arr1){
int g = 0;	
int m = 0;
for(int x = 0; x<arr1.length-1; x++){
	for(int i = 0; i<arr1.length; i++){
		int n = 0;
	if(arr1[x]==arr1[i+1]){
	n++;
	 if(g<n){
	 	m = arr1[x];
	 }
	 else if(arr1[x] == m){
	 	break;
	 }
	 
	}
}
}
if(g==1){
		return -1;
	}
	else{
		return g;
	}
}

public static int getMode(int[]arr2){
int g = 0;	
int m = 0;
for(int x = 0; x<arr2.length-1; x++){
	for(int i = 0; i<arr2.length; i++){
		int n = 0;
	if(arr1[x]==arr2[i+1]){
	n++;
	 if(g<n){
	 	m = arr2[x];
	 }
	 else if(arr2[x] == m){
	 	break;
	 }
	 
	}
}
}
if(g==1){
		return -1;
	}
	else{
		return g;
	}
}
public static int getMode(int[]arr3){
int g = 0;	
int m = 0;
for(int x = 0; x<arr3.length-1; x++){
	for(int i = 0; i<arr3.length; i++){
		int n = 0;
	if(arr2[x]==arr3[i+1]){
	n++;
	 if(g<n){
	 	m = arr3[x];
	 }
	 else if(arr3[x] == m){
	 	break;
	 }
	 
	}
	
}
}
if(g==1){
		return -1;
	}
	else{
		return g;
	}
}





}
