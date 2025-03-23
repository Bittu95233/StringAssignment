
// 2. WAP to reverse a sentence while preserving the position.
//  Input : “Think Twice”
//  Output : “kniht eciwt”

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Think Twice";
        String []words = input.split(" ");
        
        StringBuilder result = new StringBuilder();

        for(int i = 0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse());

            if(i < words.length - 1){
                result.append(" ");
            }
        }
        System.out.println("Reversed Words are : "+ result.toString());
    }
}
