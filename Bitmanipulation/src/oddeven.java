public class oddeven {
    public static void oddOrEven(int n){
      int bitMask =1;
      if((n & bitMask) == 0){
          //even number
          System.out.println("This is even number");
      }else {
          System.out.println("This is odd number");
      }
    }

    public static void main(String[] args) {
     oddOrEven(3);
        oddOrEven(4);
        oddOrEven(9);
        oddOrEven(14);
    }
}
