public class Palindrome {
    public static void main(String[] args){
        String s = "mazibuko";

     Palindrome palindrome = new Palindrome();

        System.out.println(s);
        System.out.println("simplePalindromeSolution() " + palindrome.simplePalindromeSolution(s));
        System.out.println("complexPalindromeSolution() " + palindrome.complexPalindromeSolution(s));
    }

    private String simplePalindromeSolution(String s){
        StringBuilder stringBuilder = new StringBuilder(s);

        stringBuilder = stringBuilder.reverse();

        if(s.equalsIgnoreCase(stringBuilder.toString())){
            System.out.println("String is a Palindrome");
        }
        return stringBuilder.toString();
    }
    private String complexPalindromeSolution(String s){
        String str = "";
        for(int i = s.length(); i > 0; i--){
            str = str.concat(s.substring(i-1,i));
        }
        return str;
    }
}
