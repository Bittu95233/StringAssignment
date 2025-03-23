
// 1. WAP to reverse a String.
// Input: “iNeuron”
// Output: “norueNi”

public class ReverseString {
    public static void main(String[] args) {
        String input = "iNeuron";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
