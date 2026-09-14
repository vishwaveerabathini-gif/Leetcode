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
    static TreeNode dupe;
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        TreeNode s=new TreeNode(root.val);
        dupe.right=s;
        dupe=s;
        traverse(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode temp=new TreeNode(0);
        dupe=temp;
        traverse(root);
        return temp.right;
    }
}