
public class FibSeries {
	
		  public static void main(String[] args) {

		    int n = 20, a = 0, b = 1;
		    
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		    	
		    	
		      System.out.print(a + ", ");

		      // compute the next term
		      int sum = a +b;
		                a =b ;
		                b = sum;
		      
		    }
		  }
		}

