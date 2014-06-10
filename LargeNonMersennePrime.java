//https://projecteuler.net/problem=56
//@author Conor Hughes

import java.math.*;

class LargeNonMersennePrime
{
	public static void main (String [] args)
	{
		String answer;
		BigInteger num = BigInteger.ZERO;
		num = num.add(BigInteger.valueOf(2).pow(7830457));
		num = num.multiply(BigInteger.valueOf(28433));
		num = num.add(BigInteger.valueOf(1));
		
		answer = num.toString();
		answer = answer.substring(answer.length()-10);
		System.out.println("The Last Ten Digits of The  Large Non-Mersenne Prime is " + answer);
	}
}