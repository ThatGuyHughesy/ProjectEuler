//https://projecteuler.net/problem=29
//@author Conor Hughes

import java.util.*;
import java.math.*;

class DistinctPowers
{
	public static void main (String [] args)
	{
		Set<BigInteger> numbers = new TreeSet<BigInteger>();
		BigInteger num = BigInteger.ZERO;
		
		for(int i = 2; i <= 100; i++)
		{
			for(int j = 2; j <= 100; j++)
			{
				num = num.add(BigInteger.valueOf(i).pow(j));
				numbers.add(num);
				num = BigInteger.ZERO;
			}
		}
		System.out.println("The Number of Distinct Terms is: " + numbers.size());
	}
}