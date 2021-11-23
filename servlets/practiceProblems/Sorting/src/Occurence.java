
public class Occurence {
	    //TODO : find the number of occurrence of every element and remove the duplicates
	    public static void main(String[] args) 
	    {
	        Integer ar[] = { 1, 2, 1, 1, 5, 2, 1, 3, 5, 5, 5 };
	        
	        for (int i = 0; i < ar.length; i++) 
	        {
	            if( ar[i] == null)
	                continue;
	            else
	            {
	                int count = 1 ;
	                for (int j = i+1 ; j < ar.length; j++) 
	                {
	                    if ( ar[i] == ar[j] )
	                    {
	                        count++;
	                        ar[j] = null;  
	                    }  
	                }
	                System.out.println( ar[i]+ ":" +count);
	            }    
	        }
	    
	        System.out.println("Array elements");
	        for (int i = 0; i < ar.length; i++) {
	            System.out.print(ar[i]+", ");
	        }
	    }    
	}


