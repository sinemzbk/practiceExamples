import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CharRepeatingMost {
    public static void main (String[] args){
        String s = "abcamaza";
        List<String> string = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            string.add(s.substring(i,i+1));
        }
        System.out.println(string);
        Collections.sort(string);
        System.out.println(string);

        HashMap<Integer, String> map = new HashMap<>();
        s = string.get(0);
        int count = 1;
        for(int i = 1; i < string.size(); i++){
            if(s.equalsIgnoreCase(string.get(i))){
                count++;
            }
            else{
                //if keys are the same only add it once and update the value there after
                map.put(count, s);
                s = string.get(i);
                count = 1;
            }
        }
        Integer maxKey = Collections.max(map.keySet());
        System.out.println(map.get(maxKey));
    }
}
