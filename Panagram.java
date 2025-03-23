
// 4. WAP to check if the String is a Pangram or not.

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentance");
        String sentance = sc.nextLine();

        if(isPanagram(sentance)){
            System.out.println("Given sentance is panagram");
        }
        else{
            System.out.println("Given sentance is not panagram");
        }
        sc.close();
    }

    public static boolean isPanagram(String sentance){
        sentance = sentance.toLowerCase();

        boolean[] alphabetMarker = new boolean[26];

        for (char ch : sentance.toCharArray()) {
            if(ch >= 'a' && ch <= 'z'){
                alphabetMarker[ch - 'a'] = true;
            }
        }

        for (boolean marked : alphabetMarker) {
            if(!marked)
                return false;
        }
        return true;
    }
}
