public class ImplementStrStr {
    public static void main(String args[]){

        String haystack = "hello";
        String needle = "ll";
        String haystack2 = "aaaaa";
        String needle2 = "aa";

        if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle));
        }
        else {
            System.out.println(-1);
        }
        if(haystack2.contains(needle2)){
            System.out.println(haystack2.indexOf(needle2));
        }
        else {
            System.out.println(-1);
        }
    }
}
