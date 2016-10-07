import java.io.*;
import java.util.*;

public class addNumbers
{

	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(addNumbers(a,b));
	}


	static int addNumbers(int a, int b)
	{

		int previous = 0;
		int total = 0;
		int bitA = a;
		int bitB = b; 
		int position = 0;
		while(bitA !=0 || bitB!= 0)
		{
			bitA = (a >> position) & 1; //get the bit at position
			bitB = (b >> position) & 1; 

			if( a == 1 & b == 1 ) 
			{
				total = 10;
			}else{
				total = a | b; 
			}

			previous |= (total << position); 
            position++; 
		}

		return previous; 
	}
}
