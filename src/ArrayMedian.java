import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMedian {

    public static void main(String args[]) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2,1,6,4,5};

        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            sortedList.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            sortedList.add(nums2[j]);
        }
        Collections.sort(sortedList);
        int index = sortedList.size() / 2;

        System.out.println(index);
        if(index % 2 == 0){ //length is even, need to add 2 numbers and divide by 2
            System.out.println("Median is " + (sortedList.get(index) + sortedList.get(index-1))/2);
        }
        else{
            System.out.println("Median is " + sortedList.get(index));
        }
    }
}
