import java.util.Scanner;

public class basicString {
    public static  void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
           String s1 = "Tony";
           String s2 = "Tony";
           String s3 = new String("Tony");

           if(s1 == s2){
               System.out.println("Strings are equal");
           }
           else {
               System.out.println("Strings aren't equal");
           }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings aren't equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings aren't equal");
        }


//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2  = new String("xyz");
//        //String are IMMUTABLE
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a any name:");
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);
//
//        //String fullName = "Manish kuchalia";
//        System.out.println(name.length());


        //CONCATENATION
        String firstName = "Karan";
        String lastName = "Kuchalia";
        String fullName = firstName +" "+ lastName;

     //printLetters(fullName);

    }

}
