class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int middle;
        
        while(low < high){
            middle = (low + high) / 2;
            if(target == nums[middle]){
                return middle;
            }
            else if(target > nums[middle]){
                low = middle + 1;
            }
            else{
                high = middle;
            }
        }
        return -1;
    }
}