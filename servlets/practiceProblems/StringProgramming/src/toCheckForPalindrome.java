
public class toCheckForPalindrome {
	public static void main(String[] args) {
		String s1 = new String("adada");
		String reverse  ="";
         for (int i = 0;i < s1.length(); i++)
	          reverse = s1.charAt(i) + reverse;
         if(reverse.equals(s1)) 
        	 System.out.println("its a palindrome");
         else
        	 System.out.println("its not palindrome");
	}
}
	         
 
	



