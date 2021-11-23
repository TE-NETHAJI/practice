
public class Rev
{
   public static void main(String[] args) 
   {
	String[] str = {"this", "is","java" ,"program"};
	String result = "";
	
	
	     for(int i =0; i< str.length; i++) {
		     if(i%2 ==0) {
			    for(int j = str[i].length()-1; j>=0;j++)
				
			        result+= str[i].charAt(j);
			        result+= ' ';
		            }
		     else
		    	 result += str[i] + ' ';
	     }
	     System.out.println(result);
		

}
   }
