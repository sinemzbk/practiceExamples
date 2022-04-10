import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println("First Problem");

        int target = 9;
        int[] nums = {2, 15, 11, 7};
        TwoSum twoSum = new TwoSum();

        int[] appSolution = twoSum.twoSum(nums, target);
        int[] mySolution = twoSum.twoSum(nums, target);
        System.out.println("appSolution " + appSolution[0]);
        System.out.println("appSolution " + appSolution[1]);
        System.out.println("mySolution " + mySolution[0]);
        System.out.println("mySolution " + mySolution[1]);

    }
    public Integer[] myTwoSum(int[] nums, int target) {
        List<Integer> targetNums = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    targetNums.add(j);
                    targetNums.add(i);
                    break;
                }
            }
        }
        System.out.println(targetNums);
        Integer[] arr = new Integer[targetNums.size()];
        arr = targetNums.toArray(arr);
        return arr;
    }

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
