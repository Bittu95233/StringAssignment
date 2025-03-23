
// 8. WAP to count number of special characters.

import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :: ");
        String str = sc.nextLine();

        int countSpecialChar = 0;

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);

            if(!(Character.isLetterOrDigit(ch)) && !(Character.isWhitespace(ch))){
                countSpecialChar++;
            }
        }
        System.out.println("Number of special characters:: "+countSpecialChar);

        sc.close();
    }
}
