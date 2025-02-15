import java.util.Scanner;

public class countVowel {
    public static  int findlowerCaseVowelCount(String str){
          int len = str.length();
          int vowelCount = 0;

          for(int i=0; i<len; i++){
              char ch = str.charAt(i);

              if(Character.isLowerCase(ch) == true){
                  if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                      vowelCount++;
                  }

              }
          }
          return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scn.nextLine();

        int vowelCount = findlowerCaseVowelCount(str);

        System.out.println("Number of vowels is: " + vowelCount);
    }
}
