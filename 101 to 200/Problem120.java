class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0){
            return 0;
        }
        
        int[] nums = new int[triangle.size()];
        
        for(int i = 0; i < triangle.size(); i++){
            nums[i] = triangle.get(triangle.size() - 1).get(i);
        }
        
        for(int i = triangle.size() - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                nums[j] = Math.min(nums[j], nums[j + 1]) + triangle.get(i).get(j);
            }
        }
        return nums[0];
    }
}