//https://projecteuler.net/problem=3
//@author Conor Hughes

class LargestPrimeFactor
{
	public static void main (String [] args)
	{
		long num =600851475143L;
		int prime = 0;
		int largest = 0;
		
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				for(int j = 1; j <= i; j++)
				{
					if(i % j == 0)
					{
						prime++;
					}
				}
				if(prime == 2)
				{
					largest = i;
				}
				prime = 0;
			}
		}
		System.out.println("The Largest Prime Factor of 600851475143 is " + largest);
	}
}