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
    ArrayList<Integer> list;
    public boolean isValidBST(TreeNode root) {
        
        list = new ArrayList<>();

        finds(root, list);
        if(list.size()==1) return true;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i-1)>=list.get(i)) return false;

        }
        return true;
        
    }
    private void finds(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        finds(root.left, list);
        int val = root.val;
        list.add(val);
        finds(root.right, list);
    }
}