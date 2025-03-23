
// 5. WAP to print repeatedly occurring characters in the given String.

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        findRepeatedCharacter(str);

        sc.close();
    }

    private static void findRepeatedCharacter(String str) {
        
        str = str.toLowerCase();

        int[] freq = new int[256];

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        System.out.println("Repeated Characters...");
        for(int i = 0;i<256;i++){
            if (freq[i]>1) {
                System.out.println((char) i + " -> "+ freq[i]+ " times");
            }
        }
    }
}
