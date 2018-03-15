
public class Compress {

	public static void main(String[] args) {
		IO.outputStringAnswer(compress(IO.readString()));
	}
	public static String compress(String original){
		
		String answer = "";
		int count = 0;
		
		if(original.length() == 0){
			return answer;
		}
		if(original.length() == 1){
			answer = answer+original.charAt(0);
			return answer;
		}
		if(original.length()==2)
		{
			if(original.charAt(0)== original.charAt(1))
			{
				answer = answer+"2"+original.charAt(0);
			}
			else
			{
				answer = answer+original.charAt(0)+original.charAt(1);
			}
			return answer;
		}
		
		if(original.length()>2)
		{
			if(original.charAt(0)== original.charAt(1))
			{
				count++;
			}
			else
			{
				answer = answer+original.charAt(0);
			}
		}
		for(int i = 1; i<original.length(); i++)
			{
				
				for(int j = i; j<original.length() && original.charAt(j) == original.charAt(i); j++)
				{
					count++;
				}
				if(count>1){
					answer = answer+count;
					answer = answer+original.charAt(i);
				}else answer = answer+original.charAt(i);
				
				if(i==1 && original.charAt(i-1) == original.charAt(i))
						i += count-2;
				else
					i +=count-1;
				count = 0;
			}
		return answer;
	}

}
