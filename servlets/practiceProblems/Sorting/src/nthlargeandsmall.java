import java.util.Arrays;
public class nthlargeandsmall // with sorted array
{
	
	public static void main(String[] args)
	{
		int ar[] =  {1,1,2,3,4,44,4,4,7,8,9,10,11,23,34,44,55,22,33,444,55,66,77};
		
		//           0,1,2,3,4,5 ,6,7,8,9,10,11,12,13,14,15,16,17,17,19 ,20,21,22
		
			Arrays.sort(ar);
			
			for(int i =0; i< ar.length; i++)
			{
			System.out.println(ar[i] + " ,");
			}
			
			
			int x =5;
			System.out.println( x + "smallest" +ar[x-1]);// for smallest
		
			int y =5;
			System.out.println(y+ " largest" + ar[ar.length-y]);// for largest
	
	}

}
