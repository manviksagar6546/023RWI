import java.util.Arrays;

public class Second_largestelement_array {
public static void Elements(int[] arr, int n)
{
	Arrays.sort(arr);
	//int small = arr[1];
	int large = arr[n - 2];
	System.out.println("Second largest is "+large);
}
public static void main(String[] args)
{
	int[] arr = {-9,7,6,5,5,4,0};
	int n = arr.length;
	Elements(arr, n);
}
}
