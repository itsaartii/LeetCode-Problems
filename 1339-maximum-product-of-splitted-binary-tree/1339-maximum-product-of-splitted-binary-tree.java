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
    long total = 0;
    long maxProduct = 0;
    private final int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        total = sum(root);
        calculateMaxProduct(root);
        return (int)(maxProduct%MOD);
        
        
    }
    public long sum(TreeNode root){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public long calculateMaxProduct(TreeNode root) {
        if (root == null) return 0;
        long subTreeSum = root.val + calculateMaxProduct(root.left) + calculateMaxProduct(root.right);
        long product = subTreeSum * (total - subTreeSum);
        maxProduct = Math.max(maxProduct, product);
        return subTreeSum;
    }
}