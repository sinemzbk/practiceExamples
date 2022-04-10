import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new LinkedList<>();
        list1.add(2);
        list1.add(6);
        List<Integer> list3 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        List<Integer> list4 = new LinkedList<>();
        list4.addAll(list1);
        list4.addAll(list2);
        list4.addAll(list3);
        Collections.sort(list4);

        System.out.println(list4);

    }
}
