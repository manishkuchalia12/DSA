import java.util.Scanner;
public class sumof2nd {

    public static  void helper (int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        //Approch 1
//        int sum = 0;
//        for(int j = 0; j < m; j++){
//            sum += arr[1][j];
//        }
       // Approch 1
        int sum = 0;
        for (int i = 0; i < n; i++){
            for(int j=0; j<m; j++){
                if(i==1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of elements in 2nd row is :" +sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of rows:");
        int n  = sc.nextInt();
        System.out.println("Input number of columns:");
        int m = sc.nextInt();
        int[][] arr = new int [n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("Input" + i + ","+ j +"cell:");
                arr[i][j]= sc.nextInt();
            }
        }
        helper(arr);

    }
}
