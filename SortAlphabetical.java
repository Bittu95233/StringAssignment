
// 6. WAP to sort a String Alphabetically.

import java.util.Scanner;

public class SortAlphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:: ");
        String str = sc.nextLine();

        String sortString = sortString(str);

        System.out.println("Sorted String : " + sortString);

        sc.close();
    }

    private static String sortString(String str) {
       
        char[] ch = str.toCharArray();
        char temp;
        
        for(int i =0;i<ch.length - 1;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    temp = ch[i];
                    ch[i]= ch[j];
                    ch[j] = temp;
                }
            }
        }
        return new String(ch);
    }
}
