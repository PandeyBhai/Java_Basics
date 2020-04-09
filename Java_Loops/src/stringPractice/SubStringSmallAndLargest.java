package stringPractice;

public class SubStringSmallAndLargest {
	public static void main(String args[])
	{
		int k=3;
		String s = "welcometojava";
		String[] substringofklenght = new String[s.length()];
		for(int i=0;(i+k)<s.length();i++)
		{
			substringofklenght[i]=s.substring(i,i+k);
			System.out.println(substringofklenght[i]);
		}
	}

}
