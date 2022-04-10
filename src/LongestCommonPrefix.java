public class LongestCommonPrefix {
    public static void main(String args[]){
        String[] input = {"flower", "flow", "flight"};
        boolean check = false;
        String s = input[0];
        String str = input[0];
        int length = s.length();
        for(int i = 1; i < input.length; i ++){
            for (int j = 0; j < input[j].length(); j++){
                if(input[i].contains(s.substring(0, length))){
                    str = s.substring(0, length);
                    System.out.print(input[j].substring(0, input[j].length()-1));
                    check = true;
                }
                else{
                    check = false;
                }
                length = length - 1;
            }
        }
        if(check){
            System.out.print(str);
        }
    }
}
