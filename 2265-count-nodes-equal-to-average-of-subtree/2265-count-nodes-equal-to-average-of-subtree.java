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
    static int count;
    static int eachcount;
    static int sum;
    public static void ans1(TreeNode root){
        if(root==null){
            return;
        }
        sum+=root.val;
        eachcount+=1;
        ans1(root.left);
        ans1(root.right);
    }
    public static void ans(TreeNode root){
        if(root==null){
            return;
        }
        sum=0;
        eachcount=0;
        ans1(root);
        if((sum/eachcount)==root.val){
            count++;
        }
        ans(root.left);
        ans(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        count=0;
        ans(root);
        return count;
    }
}