class Solution {
    public boolean isPalindrome(int x) {
        String converted = Integer.toString(x);
        return helper(converted);
    }
    private boolean helper(String string){
        if(string == null || string.length() == 1){
            return true;
        }
        else if(string.length() == 2 && string.charAt(0) == string.charAt(string.length() - 1) ){
            return true;
        }
        else{
            return string.charAt(0) == string.charAt(string.length() - 1) && helper(string.substring(1,string.length() - 1));
        }
    }
}