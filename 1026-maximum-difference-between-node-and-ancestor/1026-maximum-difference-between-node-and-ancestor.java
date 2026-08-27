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
    public void traverse(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        for(int i=0;i<arr.size();i++){
            max=Math.max(max,Math.abs(arr.get(i)-arr.get(arr.size()-1)));
        }
        traverse(root.left,arr);
        traverse(root.right,arr);
        arr.remove(arr.size()-1);
    }
    public int maxAncestorDiff(TreeNode root) {
        max=0;
        ArrayList<Integer> arr= new ArrayList<>();
        traverse(root,arr);
        return max;
    }
}