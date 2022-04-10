import java.awt.*;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "babad";
        StringBuilder str = new StringBuilder();
        String longest = s.substring(0, 1);
        char firstChar = s.charAt(0);
        for (int m = 0; m < s.length(); m++) {


            for (int i = 1; i < s.length(); i++) {
                char temp = s.charAt(i);
                longest = longest + temp;

                //check palindrome
                for (int j = longest.length() - 1; j > 0; j--) {
                    str.append(new StringBuilder(longest.substring(j - 1, j)).reverse());
                }

                if (longest.equalsIgnoreCase(str.toString())) {
                    System.out.println(str);
                    break;
                }
            }
        }
//        System.out.println(str);
    }
}
