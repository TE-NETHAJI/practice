package arrayProperties.Array;

public class ArrayMyLogic {
	
	private int[] arr;
	private int position;
	private final int DEFAULT_SIZE =10;
	
	
	public ArrayMyLogic() {
		arr = new int [DEFAULT_SIZE];
		
	}
	
	public ArrayMyLogic(int intialSize) {
		arr = new int [intialSize];
		
	}
	
	public boolean add(int element) {
		arr = ensureCapacity(arr);
		arr[position++] = element;
		return true;
		
	}
	private int[] ensureCapacity(int[] arr) {
		return (position< arr.length ? arr : grow(arr, arr.length));
		
	}
	
	private int[] grow(int[] arr, int oldCapacity) {
		int newSize = (oldCapacity + oldCapacity >> 1);
		int [] arr2 =  new int [newSize];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		return arr2;
		
	}
	
	public int get(int index) {
		return arr[index];
		
	}
	
	public int size() {
		return arr.length;
		
	}
	public void set(int index,int element) {
		arr[index] = element;
	}
	
	public void remove(int index) {
		int length = arr.length-index-1;
		System.arraycopy(arr, index+1, arr, index, length);
		position--;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(" [ ");
		for (int i = 0; i < position-1; i++) {
			str.append(arr[i] + " ,");
			
		}
		str.append(arr[position-1] + " ]");
		
		return str.toString();
	}
	public static void main(String[] args) {
		
		ArrayMyLogic ar = new ArrayMyLogic();
		ar.add(10);
		ar.add(11);
		ar.remove(2);
		System.out.println(ar);
	}
	
}
