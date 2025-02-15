

public class transposeMat {
    public static void helper (int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int[][] transpose_array = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                transpose_array[i][j] = arr[j][i];
            }
        }
        System.out.println(" Print Transpose 2D Array");
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print( transpose_array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println("Original Array");
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        helper(array);
    }
}
