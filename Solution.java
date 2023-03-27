import java.util.HashMap;
import java.util.Map;

class Solution {


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = nums.length-1; i>= 0; i--) {
            for (int j = 0; j < nums.length; j++) {
                    if (nums[i]+ nums[j] == target && i != j){
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
            }
        }

        return result;
    }

}
