//https://projecteuler.net/problem=6
//@author Conor Hughes

class SumSquareDifference
{
	public static void main (String [] args)
	{
		int sumsquare = 0;
		int squaresum = 0;
		int result = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sumsquare += i;
		}
		sumsquare = sumsquare^2;
		
		for(int j = 1; j <= 100; j++)
		{
			sumsquare += j^2;
		}
		
		result = sumsquare - squaresum;
		
		System.out.println("The Sum Square Difference is " + result);
	}
}