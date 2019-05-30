import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hmap.containsKey(nums[i])){
                int firstIndex = hmap.get(nums[i]);
                int[] answer = {firstIndex, i};
                return answer;
            }
            hmap.put(complement, i);
        }
        return null;
    }
}