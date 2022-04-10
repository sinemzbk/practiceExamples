public class PalindromeNumber {

    public static void main(String[] args){
        int num = 121;
        int temp = 121;
        int palindrome = 0;

        palindrome += num % 10;
        num = num / 10;

        while (num > 0){
            palindrome = palindrome * 10;
            palindrome += num % 10;
            num = num / 10;
        }

        if(palindrome == temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        System.out.println(palindrome);
    }
}
