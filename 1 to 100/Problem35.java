class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int medium = (start + end) / 2;
        while(start <= end){
            medium = (start + end) / 2;
            if(nums[medium] == target){
                return medium;
            }
            else if(nums[medium] > target){
                end = medium - 1;
            }
            else{
                start = medium + 1;
            }
        }
        if(nums[medium] > target){
            return medium;
        }
        else{
            return medium + 1;
        }
    }
}