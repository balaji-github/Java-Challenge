package javachallenge;

public class GetLengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfLastWord("Hello World");
		LengthOfLastWord("  fly me   to   the moon  ");
		LengthOfLastWord("luffy is still joyboy");

	}

	public static void LengthOfLastWord(String s)
	{
		int leng;
		System.out.println("Input String: "+s);
		//Split the sentence into words by white space
		//Store the words of the sentence in the string array words
		String[] words = s.split(" ");
		//Get the length of the array ie. the number of words in the String array		
		//Get the length of the last word
		System.out.println("Last word of given input: "+words[words.length-1]);

		leng = words[words.length-1].length();
		System.out.println("Last word length: "+leng);
		System.out.println();
	}

}
