import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> idx = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer j = idx.get(need);
            if (j != null) return new int[] { j, i };
            idx.put(nums[i], i);
        }
        return new int[0];
    }
}
