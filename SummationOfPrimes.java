//https://projecteuler.net/problem=10
//@author Conor Hughes

import java.math.*;

//Warning takes FOREVER to calculate
class SummationOfPrimes
{
	public static void main (String [] args)
	{
		long num = 1;
		BigInteger sum = BigInteger.ZERO;
		long primecounter = 0;
		long twoMillion = 2000000;
		
		while(num < twoMillion)
		{
			int i;
			for(i = 1; i <= num; i++)
			{
				if(num % i == 0)
				{
					primecounter++;
				}
			}
			if(primecounter == 2)
			{
				sum = sum.add(BigInteger.valueOf(num));
			}
			primecounter = 0;
			num++;
		}
		
		System.out.println("The Sum of All Primes Below 2 Million is " + sum);
	}
}