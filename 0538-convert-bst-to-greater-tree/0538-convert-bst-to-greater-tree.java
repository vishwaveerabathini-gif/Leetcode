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
    static int z;
    public TreeNode traverse(TreeNode root){
        if(root==null){
            return null;
        }
        root.right=traverse(root.right);
        z+=root.val;
        root.val=z;
        root.left=traverse(root.left);
        return root;
    }
    public TreeNode convertBST(TreeNode root) {
        HashSet<Integer> map=new HashSet<>();
        z=0;
        return traverse(root); 
    }
}