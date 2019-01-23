
public class SumOfArrayElements {
	
	public static void main(String args[]) {
		
		int[] arr = {5,6,9,7,5,210,44,5,8,99};
		int sum = 0;
		for(int element: arr)
		{
			sum+=element;
		}
		System.out.print("The Sum of array elements is " + sum);
	}
}
