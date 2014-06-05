//https://projecteuler.net/problem=2
//@author Conor Hughes

class EvenFibonacciNumbers
{
	public static void main (String [] args)
	{
		int sum = 0;
		int num =1;
		int last = 1;
		
		while(num <= 4000000)
		{
			int temp = num;
			num += last;
			last = temp;
			
			if(num % 2 == 0)
			{
				sum += num;
			}
		}
		System.out.println("The Sum of All Even Fibonacci Numbers Less Than 4 Million is " + sum);
	}
}