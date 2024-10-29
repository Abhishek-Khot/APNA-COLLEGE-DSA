package HashMap;

import java.util.HashMap;
import java.util.Map;

public class AssignTwo {
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int index =0;index<nums.length;index++)
        {
            int diff  = target-nums[index];
            if(map.containsKey(diff))
            {
                return new int[] {index , map.get(diff)};
            }
            map.put(nums[index],index);
        }
        return new int[]{0,0};
    }
}
}
