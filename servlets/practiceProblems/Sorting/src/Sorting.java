
public class Sorting {
	public static void main(String[] args) {
		
		
		int ary[] = {40,1,3,4,-1,5,2,5,0,22,10,30,12,-20,11,5,6,7,8,9};
		
		System.out.println("largest of the given array:     " +largest(ary));
		System.out.println("smallest of the given array:    "+Smallest(ary));
		
	}
	
	public static int Smallest(int ary[])
	{
		int small = ary[0];
		
		for(int i = 1; i < ary.length; i++) {
			if(small > ary[i])
				small = ary[i];
		}
		return small;
		}
	
	public static int largest(int ary[])
	{
		int large = ary[0];
		
		for(int i=1; i< ary.length; i++) 
		{
			if(large < ary[i])
				large = ary[i];
						
		}
		return large;
	}
	
}
	

