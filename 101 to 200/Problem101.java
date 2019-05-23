/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        else{
            return helper(root.left, root.right);
        }  
    }
    
    private boolean helper(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }
        else if(leftNode == null && rightNode != null){
            return false;
        }
        else if(leftNode != null && rightNode == null){
            return false;
        }
        else{
            return helper(leftNode.left, rightNode.right) && helper(leftNode.right, rightNode.left) && (leftNode.val == rightNode.val);
        }
    }
}