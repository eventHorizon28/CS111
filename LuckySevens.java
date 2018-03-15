
public class LuckySevens
{

	public static void main(String[] args)
	{
		System.out.println("Enter lower limit no.: ");
		int x = IO.readInt();
		System.out.println("Enter upper limit no.: ");
		int y = IO.readInt();
		int count = 0;
	
		if(x>y) //error check
		{
			IO.reportBadInput();
			return;
		}
		for(int number = x; number<=y; number++)
		{
			int currentNumber = number;
			for(int a = x-2; a<=y; a++)
			{
				if (currentNumber % 10 == 7 || currentNumber % 10 == -7) 
				{
	                    count++;
				}
				currentNumber = currentNumber - (currentNumber % 10);
	            currentNumber /= 10;
			}
		}
			IO.outputIntAnswer(count);
	}
}