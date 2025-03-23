
// 7. WAP to count the number of Vowels and Consonants of a String value.

import java.util.Scanner;

public class countVowelsConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int countVowels=0, countConsonant = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                    countVowels++;
                }
                else{
                    countConsonant++;
                }
            }
        }
        System.out.println("Number of vowels: " + countVowels);
        System.out.println("Number of consonants:: " + countConsonant);

        sc.close();
    }
}
