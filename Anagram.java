
// 3. WAP to check if the String is Anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String first = sc.nextLine();

        System.out.print("Enter Second String: ");
        String second = sc.nextLine();

        if (isAnagram(first,second)) {
            System.out.println(first + " and " + second + " are anagrams");
        }
        else{
            System.out.println(first + " and " + second + " are not anagrams");
        }
        sc.close();
    }
    public static boolean isAnagram(String first, String second){
        first = first.replaceAll("\\s", " ").toLowerCase();
        second = second.replaceAll("\\s", " ").toLowerCase();

        if(first.length() != second.length()){
            return false;
        }

        char[] charArray1 = first.toCharArray();
        char[] charArray2 = second.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
