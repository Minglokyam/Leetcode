class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Solution solution = new Solution();
        return solution.helper(l1, l2, false);
    }
    
    private ListNode helper(ListNode l1, ListNode l2, boolean addOne){
        int l1value;
        int l2value;
        int sum;
        
        if(l1 == null){
            l1value = 0;
        }
        else{
            l1value = l1.val;
        }
        
        if(l2 == null){
            l2value = 0;
        }
        else{
            l2value = l2.val;
        }
        
        if(addOne){
            sum = l1value + l2value + 1;
        }
        else{
            sum = l1value + l2value;
        }
        
        if(l1 == null && l2 == null && addOne == false){
            return null;
        }
        else{
            ListNode l3;
            if(sum < 10){
                l3 = new ListNode(sum);
                if(l1 == null && l2 == null){
                    l3.next = helper(l1, l2, false);
                }
                else if(l1 == null){
                    l3.next = helper(l1, l2.next, false);
                }
                else if(l2 == null){
                    l3.next = helper(l1.next, l2, false);
                }
                else{
                    l3.next = helper(l1.next, l2.next, false);
                }
            }
            else{
                l3 = new ListNode(sum - 10);
                if(l1 == null && l2 == null){
                    l3.next = helper(l1, l2, true);
                }
                else if(l1 == null){
                    l3.next = helper(l1, l2.next, true);
                }
                else if(l2 == null){
                    l3.next = helper(l1.next, l2, true);
                }
                else{
                    l3.next = helper(l1.next, l2.next, true);
                }
            }
            return l3;
        }
    }
}