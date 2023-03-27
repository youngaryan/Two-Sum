import java.util.HashMap;
import java.util.Map;

class Solution {


    public int[] twoSum(int[] nums, int target) {
        int[] finalResult = new int[2];
        int[] result = new int[2];
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = nums.length-1; i>= 0; i--) {
            int num = nums[i];


            integerIntegerMap.put(target - num, num);
            if (integerIntegerMap.containsValue(target - num)) {
                result[1] = num;
                integerIntegerMap.remove(nums[i]);
                result[0] = target - num;
                break;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == result[0]) {
                finalResult[1] = i;
            } else if (nums[i] == result[1]) {
                finalResult[0] = i;
            }
        }
        return finalResult;
    }

}
