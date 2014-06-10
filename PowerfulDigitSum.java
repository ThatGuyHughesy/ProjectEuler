//https://projecteuler.net/problem=56
//@author Conor Hughes

import java.math.*;

class PowerfulDigitSum
{
	public static void main (String [] args)
	{
		
		BigInteger num = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		BigInteger largest = BigInteger.ZERO;
		
		for(int i = 2; i <= 100; i++)
		{
			for(int j = 2; j <= 100; j++)
			{
				num = num.add(BigInteger.valueOf(i).pow(j));
				
				while(num.compareTo(BigInteger.ZERO) > 0)
				{
					sum = sum.add(num.mod(BigInteger.valueOf(10)));
					num = num.divide(BigInteger.valueOf(10));
				}
				
				if(sum.compareTo(largest) == 1)
				{
					largest = sum;
				}
				
				sum = BigInteger.ZERO;
				num = BigInteger.ZERO;
			}
		}
		System.out.println("The Maximum Digital Sum is: " + largest);
	}
}