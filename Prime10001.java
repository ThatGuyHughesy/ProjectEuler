//https://projecteuler.net/problem=6
//@author Conor Hughes

class Prime10001
{
	public static void main (String [] args)
	{
		int num = 0;
		int counter = 0;
		int primecounter = 0;
		
		while(counter < 10001)
		{
			num++;
			
			for(int i = 1; i <= num; i++)
			{
				if(num % i == 0)
				{
					primecounter++;
				}
			}
			if(primecounter == 2)
			{
				counter++;
			}
			primecounter = 0;
		}
		
		System.out.println("The 10001 Prime is " + num);
	}
}