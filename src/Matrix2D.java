import java.util.Scanner;

public class Matrix2D {

    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//        };
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[2][2];

        int n = arr.length; //number of rows
        int m = arr[0].length; //number of columns
        System.out.println("Enter the 2D matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

               arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the 2D array");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
