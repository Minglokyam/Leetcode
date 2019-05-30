class Solution{
    public String largestNumber(int[] nums) {
        String answer = "";
        String[] array = new String[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count += 1;
            }
            array[i] = "" + nums[i];
        }
        if(count == array.length){
            return "0";
        }
        
        Arrays.sort(array, new Comparator<String>(){
            public int compare(String string1, String string2){
                String first = string1 + string2;
                String second = string2 + string1;
                return first.compareTo(second);
            }
        });
        for(int i = array.length - 1; i >= 0; i--){
            answer += array[i];
        }
        return answer; 
    }
}