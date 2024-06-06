import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Read array elements
        int[] a = new int[size];
        System.out.println("Enter " + size + " sorted elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Read target element
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Perform binary search
        int find = binarySearch(a, target);
        if (find == -1) {
            System.out.println("The target is not present.");
        } else {
            System.out.println("The target is at index: " + find);
        }
    }
    
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}


