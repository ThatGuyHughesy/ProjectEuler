//https://projecteuler.net/problem=12
//@author Conor Hughes

class HighlyDivisibleTriangularNumber
{
	public static void main (String [] args)
	{
		boolean found = false;
		int triangle = 1;
		long sum = 0;
		int count = 0;
		
		while(count < 500)
		{
			count = 0;
			sum = 0;
			
			for(int i = 1; i <= triangle; i++)
			{
				sum += i;
			}
			
			for(int j = 1; j <= sum; j++)
			{
				if(sum % j == 0)
				{
					count++;
				}
			}
			
			triangle++;
		}
		System.out.println("The First Triangle Number With 500 Divisors is " + triangle);
	}
}