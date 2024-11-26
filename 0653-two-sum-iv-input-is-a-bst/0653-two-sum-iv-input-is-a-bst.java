/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashSet<Integer> set;
    boolean flag = false;
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        finds(root, k, set);
        return flag;
        
        
    }
    private void finds(TreeNode root, int k, HashSet<Integer> set){
        if(root == null) return;
        int value = root.val;
        if(set.contains(k-value)){
            flag = true;
        }
        set.add(value);
        finds(root.left, k, set);
        finds(root.right, k, set);
    }
}