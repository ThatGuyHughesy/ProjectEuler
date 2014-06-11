//https://projecteuler.net/problem=206
//@author Conor Hughes

import java.math.*;

class ConcealedSquare
{
	public static void main(String[] args) 
	{
		for (long l = 1010101010; l < 1389026623; l+=10)
		{
			long squared = l * l;
			String s = Long.toString(squared);
			if ((s.charAt(0) == '1') && (s.charAt(2) == '2') && (s.charAt(4) == '3') && (s.charAt(6) == '4') && (s.charAt(8) == '5') && (s.charAt(10) == '6') && (s.charAt(12) == '7') && (s.charAt(14) == '8')  && (s.charAt(16) == '9') && (s.charAt(18) == '0'))
			{
				System.out.println("The Concealed Square is " + s + " With The Root " + l);
			}
		}
	}
}