import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {3,2,1};
		BubbleSort sorter  = new BubbleSort();
		sorter.Sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
