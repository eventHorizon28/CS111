
public class TwoSmallest {

	public static void main(String[] args) {
		
		System.out.println("Enter Terminating number: ");
		double term = IO.readDouble();
		int count = 0;
		double smallest = 0;
		double small = 0;
		
		while(count == 0)
		{
			smallest = IO.readDouble();
			
			if(smallest != term)
			{
				count++;
				break;
			}
			else
			{
				smallest = 0;
				IO.reportBadInput();
			}
		}
		while(count == 1)
		{
			small = IO.readDouble();
			if(small != term)
			{
				count++;
				break;
			}
			else
			{
				small = 0;
				IO.reportBadInput();
			}
		}
		double x = IO.readDouble();
			do
			{
				if(count<1 || x != term)
				{
					if(x<smallest)
						smallest = x;
					else if(x<small)
						small = x;
					count++;
					x = IO.readDouble();
				}
			}while(x!=term);
		
			if(smallest<small)
			{
				IO.outputDoubleAnswer(smallest);
				IO.outputDoubleAnswer(small);
			}
			else
			{
				IO.outputDoubleAnswer(small);
				IO.outputDoubleAnswer(smallest);
			}

	}
}
