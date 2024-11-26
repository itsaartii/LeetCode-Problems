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
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        finds(root, k);
        return result;
    }
    private void finds(TreeNode root, int k){
        if(root == null) return;

        finds(root.left, k);
        count++;
        if(count == k){
            result = root.val;
            return;
        }
        finds(root.right, k);
    }
}