import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args){
        String s = "aabcabcbb";

        char[] list = s.toCharArray();
        HashMap<String, Integer> map = new HashMap();

        String str = s.substring(0,1);
        int count = 1;
        for(int i = 1; i < list.length; i++){

            if(!str.equalsIgnoreCase(String.valueOf(list[i]))){
                str += (String.valueOf(list[i]));
            }
            else{
                map.put(str, count);
                str = new String();
                count++;
            }
        }
        System.out.println(list);
        System.out.println(map);
    }
}
