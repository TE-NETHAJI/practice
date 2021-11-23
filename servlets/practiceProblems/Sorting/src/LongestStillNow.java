import java.util.HashSet;

public class LongestStillNow {
	
	public static void main(String[] args) {
		String str = "abcdab";
		Longest(str);
	}


	public static String Longest(String str) {
		HashSet<Character> set = new HashSet<>();
		
		 String LongestStillNow =" ";
		 String LongestOverAll = " ";
		 
		for(int i = 0; i <str.length(); i++) {
			char c = str.charAt(i);
			if(set.contains(c))
			{
				LongestStillNow=" ";
				set.clear();
			}
			//LongestStillNow+= c;
			set.add(c);
			LongestStillNow += c;
			if(LongestStillNow.length() > LongestOverAll.length())
			{
				LongestStillNow =LongestOverAll;	
			}
			
		}
		
            return LongestOverAll;
	}

}

