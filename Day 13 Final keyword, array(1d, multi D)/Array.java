import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("enter elements");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("after enter");
        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
