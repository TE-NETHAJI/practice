import java.util.*;
import java.util.Collections;
public class random 
{
    public static void main(String[] args) 
    {
        //TODO : to randomly shuffle the array or String elements

        int ar[]= {1,2,3,4,5,6,7,8};

        shuffle(ar);
        
    }

    public static void shuffle(int ar[])
    {
    	ArrayList<Integer> Shuffled= new ArrayList<>();
    	int[] res = {};
        for (int i = 0; i < ar.length; i++) {
            Shuffled.add(ar[i]);
            Collections.shuffle( Shuffled );

            res[ar]= new int[ar.length];
           
        }
        System.out.print(res.toString()+" ,");
    }
}
