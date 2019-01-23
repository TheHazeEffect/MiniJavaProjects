
public class Palindrome {
	public static void main(String args[])
		{
			String word = new String("daad");
			if(checkPalindrome(word))
			{
				System.out.print(word + " is a palindrome");
			}
			else
			{
				System.out.print(word + " is not a palindrome");
			}
		}
	public static boolean checkPalindrome(String word)
	{
		boolean isPalindrome = true;
		int wordlength = word.length();//Save the length of word
		StringBuilder newWord = new StringBuilder(word);
		//StringBuilder is faster than StringBuffer but is not thread safe
		
		newWord.reverse();
		//reverse the character order of "word" and save to "newWord"
		for(int i=0;i<wordlength;i++)
		{
			if(word.charAt(i)==newWord.charAt(wordlength-1-i))
			{
				continue;
			}
			else
			{
				isPalindrome=false;
			}
			
			
		}
		return isPalindrome;
		
	}
}
