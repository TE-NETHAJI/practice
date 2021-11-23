
public class unsorted {
	public static void main(String[] args) {
		int ar[] =  {1,1,2,3,4,44,4,4,7,8,9,10,11,23,34,44,55,22,33,444,55,66,77};
		for(int i =0; i< ar.length;i++)
		{
			for(int j = i+1; j< ar.length; j++)
			{
				if(ar[i] >ar[j])
				{
					// swapping the numbers
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i = 0; i< ar.length; i++)
		{
			System.out.println(ar[i]);	// use the nth sorting to print the value
		}	
	}
}
