//https://projecteuler.net/problem=20
//@author Conor Hughes

import java.math.*;

class FactorialDigitSum
{
	public static void main (String [] args)
	{
		BigInteger factorial = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i <= 100; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		while(factorial.compareTo(BigInteger.ZERO) > 0)
		{
			sum = sum.add(factorial.mod(BigInteger.valueOf(10)));
			factorial = factorial.divide(BigInteger.valueOf(10));
		}
		
		System.out.println("The Factorial Digit Sum of 100 is " + sum);
	}
}