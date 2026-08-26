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
    public TreeNode traverse(int[] nums,int low,int high){
        if(low>=high){
            return null;
        }
        int max=nums[low];
        int idx=low;
        for(int z=low+1;z<high;z++){
            max=Math.max(max,nums[z]);
            if(nums[z]==max){
                idx=z;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=traverse(nums,low,idx);
        root.right=traverse(nums,idx+1,high);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traverse(nums,0,nums.length);
    }
}