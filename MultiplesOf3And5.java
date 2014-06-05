//https://projecteuler.net/problem=1
//@author Conor Hughes

class MultiplesOf3And5
{
	public static void main (String [] args)
	{
		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum += i;
			}
		}
		System.out.println("The Sum of All Multiples of 3 & 5 below 1000 is " + sum);
	}
}