class Solution {
    public void duplicateZeros(int[] arr) {
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == 0){
                for(int k = arr.length - 1; k >= j + 1; k--){
                    arr[k] = arr [k - 1];
                }
                j = j + 1;
            }
        }
    }
}