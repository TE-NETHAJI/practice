
public class swaptwovar {
  public static void main(String[] args) 
	    {
	        int a = 10, b=20;
	        System.out.println(" Before Swapping : A=>"+a+",  B=>"+b);
	        a = (a+b)-(b=a);
	        System.out.println(" After  Swapping : A=>"+a+",  B=>"+b);

	        System.out.println("----------------------------------------------");

	        char x = 'a', y='@';
	        System.out.println(" Before Swapping : x=>"+x+",  y=>"+y);
	        x = (char)( (x+y) - (y=x) );
	        System.out.println(" After  Swapping : x=>"+x+",  B=>"+y);
	    }
	}


