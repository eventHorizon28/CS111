
public class PayFriend 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Amount: ");
		double a = IO.readDouble();
		
		if(a>0 && a<=100)
		{
			IO.outputDoubleAnswer(5);
		}
		else if(a>100 && a<1000)
		{
			if((3*a/100)<6)
			{
				IO.outputDoubleAnswer(6);
			}
			else
			{
				IO.outputDoubleAnswer(3*a/100);
			}
		}
		else if(a>=1000 && a<10000)
		{
			if((a/100)<15)
			{
				IO.outputDoubleAnswer(15);
			}
			else
			{
				IO.outputDoubleAnswer(a/100);
			}
		}
		else if(a>=10000)
		{
			double fee = 100;
			
			if((a-10000)>0)
			{
				if(a-10000<=5000)
				{	
					IO.outputDoubleAnswer(fee+((a-10000)*2/100));
				}
				else
				{
					fee = fee +(5000*2/100);
					IO.outputDoubleAnswer(fee+(a-15000)*3/100);
				}
			}
	

		}
		else
		{
			System.out.println("Invalid input!");
			return;
		}

	}

}
