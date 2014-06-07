//https://projecteuler.net/problem=48
//@author Conor Hughes

import java.math.*;

class SelfPowers
{
	public static void main (String [] args)
	{
		String answer;
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i <= 1000; i++)
		{
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		
		answer = sum.toString();
		answer = answer.substring(answer.length()-10);
		System.out.println("The Last Ten Digits of The Series Are " + answer);
	}
}