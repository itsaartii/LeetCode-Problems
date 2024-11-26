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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        addel(root1, list);
        addel(root2, list);
        Collections.sort(list);
        return list;
    }
    private void addel(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        addel(root.left, list);
        int value = root.val;
        list.add(value);
        addel(root.right, list);
    }
}