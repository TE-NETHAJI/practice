
public class palindrome {
public static void main(String[] args) {
	String str = "mam";
	String reverse = " ";
	for(int i =0; i<str.length(); i++)
	{
		reverse = str.charAt(i)+ reverse;
	if(str.equals(reverse)) 
	{
		System.out.println("palindrome");
	}
	}
}
}
