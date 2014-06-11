//https://projecteuler.net/problem=25
//@author Conor Hughes

import java.math.*;

class ThousandDigitFibonacciNumber
{
	public static void main (String [] args)
	{
		BigInteger num = BigInteger.ZERO;
		BigInteger last = BigInteger.ONE;
		BigInteger temp = BigInteger.ZERO;
		String size = "";
		int term = 0;
		
		while(size.length() < 1000)
		{
			temp = num;
			num = num.add(last);
			last = temp;
		
			size = num.toString();
			term++;
		}
		
		System.out.println("The First 1000 Digit Fibonacci Number Is The " + term + "th Term:\n" + size);
	}
}