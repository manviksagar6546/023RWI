import java.util.Scanner;

public class Multi_d_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];

        // Input elements of the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        // Print elements of the array
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Element [" + i + "][" + j + "]: " + array[i][j]);
            }
        }
    }
}
