
public class SmallestLargest {

	public static void main(String[] args) {
		System.out.println("Enter terminating number: ");
		double term = IO.readDouble();
		int count = 0;
		double x = IO.readDouble();
		double min = x;
		double max = x;
		
		do
		{
			if(count <2 && x==term)
			{
				IO.reportBadInput();
				return;
			}
			else
			{
				if(x>max)
				{
					max = x;
				}
				if(x<min)
				{
					min = x;
				}
				count++;
			}
			x = IO.readDouble();
		}while(x != term);
		
		IO.outputDoubleAnswer(max);
		IO.outputDoubleAnswer(min);
	}

}
