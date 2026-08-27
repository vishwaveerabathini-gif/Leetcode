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
    static int max;
    public void traverse(TreeNode root,int i,int j){
        if(root==null){
            return;
        }
        i=Math.max(i,root.val);
        j=Math.min(j,root.val);
        traverse(root.left,i,j);
        traverse(root.right,i,j);
        max=Math.max(max,Math.abs(i-j));
    }
    public int maxAncestorDiff(TreeNode root) {
        max=0;
        int high=root.val;
        int low=root.val;
        traverse(root,high,low);
        return max;
    }
}