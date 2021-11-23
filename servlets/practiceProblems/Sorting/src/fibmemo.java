
public class fibmemo {
  public static void main(String[] args) {
	     int MAX = 100;
	     int NIL = -1;
  }
  static void initialize()
  {
	 
	  int[] lookup = null;
	for(int i =0; i< 100; i++)
		  lookup[i]= 0;  
  }
  
static int fib(int n)
  {
	int[] lookup = null;
	if(lookup[n]== -1)
		
	{
		if(n<= 1)
			lookup[n]= n;
		else
			lookup[n] = fib(n-1)+fib(n-2);
	}
	return lookup[n];
  }
}
		


