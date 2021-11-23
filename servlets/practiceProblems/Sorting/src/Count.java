
public class Count {

	    //TODO : Remove the duplicates
	    public static void main(String[] args) 
	    {
	        Integer ar[] = { 1, 2,1 ,4 ,5 ,1 ,2 ,3 ,2 ,1 ,2 ,6 ,2 ,1, 5 };
	        
	        for (int i = 0; i < ar.length; i++) 
	        {
	            if( ar[i] == null)
	                continue;
	            else
	            {
	                for (int j = i+1 ; j < ar.length; j++) 
	                {
	                    if ( ar[i] == ar[j] )
	                    {
	                        ar[j] = null;  
	                    }  
	                }
	            }    
	        }
	        int count=0;
	        System.out.println("Array elements");
	        for (int i = 0; i < ar.length; i++) 
	        {
	            if(ar[i]!=null) count++;
	            System.out.print(ar[i]+", ");
	        }
	        Integer temp[] = new Integer[ count ];

	        for (int i = 0, j =0; i < ar.length && j<temp.length; i++) 
	        {
	            if(ar[i]!= null)
	                temp[j++] = ar[i];    
	        }

	        System.out.println("\n--------------------------------");
	        for (int i = 0; i < temp.length; i++) 
	        {
	            System.out.print( temp[i]+", ");    
	        }
	    }    
	}



