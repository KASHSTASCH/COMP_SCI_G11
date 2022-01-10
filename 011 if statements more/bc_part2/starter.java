import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	int a ;
	a = sc.nextInt();
	int b;
	b = sc.nextInt();
	int c;
	c = sc.nextInt();
	System.out.println( );
	if(a>b)
	{
		if(a>c)
		{
			System.out.println(a);
		}
	}
	if(b>a)
	{
		if(b>c)
		{System.out.println(b);
		}
		
	}
	if(c>a)
	{
		if(c>b)
		{System.out.println(c);
			
		}
	}
		if(a<b)
	{
		if(a<c)
		{
			System.out.println(a);
		}
	}
	if(b<a)
	{
		if(b<c)
		{System.out.println(b);
		}
		
	}
	if(c<a)
	{
		if(c<b)
		{System.out.println(c);
			
		}
	}
	System.out.println("the first number is the largest and the second is the smallest");
	}
}
