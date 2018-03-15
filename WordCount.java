
public class WordCount {

	public static void main(String[] args) {
		System.out.println(countWords(IO.readString(), IO.readInt()));

	}
	public static int countWords(String original, int minLength){
		
		int count = 0;
		String sen = original.replaceAll("[^a-zA-Z\\s]", "");
		sen = sen.replaceAll("\\s+", " ");
				
		if(sen.length()==0)
		{
			if(0>=minLength)
				count++;
		return count;
		}
		
		if(sen.charAt(sen.length()-1) != ' ')
		{
			sen = sen + " ";
		}
		
		int word=0;

		for (int i = 0; i < sen.length(); i++) {
			
			if (sen.charAt(i) == ' ')
			{
				if(word>=minLength){
	        	   count++;
				}
				word = 0;
			}
			
			else
			{
				word++;
	        }
		}
		return count;
	}
}