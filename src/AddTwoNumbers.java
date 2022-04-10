import java.util.HashMap;
import java.util.LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
        LinkedList<Integer> firstList = new LinkedList<Integer>();
        LinkedList<Integer> secondList = new LinkedList<Integer>();
        LinkedList<Integer> resultsList = new LinkedList<Integer>();

        //Adding elements to the Linked list
        firstList.add(2);
        firstList.add(4);
        firstList.add(3);

        secondList.add(5);
        secondList.add(6);
        secondList.add(4);
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int sum = 0;

        for (int i = firstList.size() - 1; i >= 0 ; i--) {
            map1.put(i+1, firstList.get(i));
            map2.put(i+1, secondList.get(i));
            sum = firstList.get(i) + secondList.get(i);
            if(sum % 10 == 0){
                if(firstList.get(i-1) != null){
                    resultsList.add(0);
                    firstList.set(i-1,(firstList.get(i-1)+(sum/10)));
                }
                else {
                    resultsList.add(sum);
                }
            }
            else {
                resultsList.add(firstList.get(i) + secondList.get(i));
            }
        }


        System.out.println(map1);
        System.out.println(map2);
        System.out.println(resultsList);
    }
}
