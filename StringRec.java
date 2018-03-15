
public class StringRec {
	
	public static String decompress(String compressedText)
	{
		char c= ' ';
		
		if(compressedText.length() == 0)
			return compressedText;
		if(compressedText.length()== 1)
		{
			if(Character.isDigit((compressedText.charAt(0)))==  false)
				return compressedText;
			else
				return null;
		}
		
		if(Character.isDigit((compressedText.charAt(0)))==  false)
		{
			return compressedText.charAt(0)+ decompress(compressedText.substring(1));
		}
		
		if(Character.isDigit((compressedText.charAt(0)))== true)
		{
			if(compressedText.length() == 0)
				return compressedText;
			
			else if(compressedText.charAt(0) == '2')
				return compressedText.charAt(1)+decompress(compressedText.substring(1));
			
			else
				c = compressedText.charAt(0);
				c--;
				return compressedText.charAt(1)+decompress(c+compressedText.substring(1));
		}

		return null;
			
	}
}
