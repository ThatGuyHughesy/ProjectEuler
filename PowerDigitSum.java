//https://projecteuler.net/problem=16
//@author Conor Hughes

class PowerDigitSum
{
	public static void main (String [] args)
	{
		double num = Math.pow(2, 1000);
		int sum = 0;
		
		while (num > 0) 
		{
			sum += num % 10;
			num = num / 10;
		}

		System.out.println("The Power Digit Sum is " + sum);
	}
}