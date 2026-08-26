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
    static int sum;
    public void subt(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        subt(root.right,arr);
        root.val=arr.get(0);
        arr.remove(0);
        subt(root.left,arr);
    }
    public void traverse(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        traverse(root.right,arr);
        sum+=root.val;
        arr.add(sum);
        traverse(root.left,arr);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        ArrayList<Integer> arr=new ArrayList<>();
        traverse(root,arr);
        subt(root,arr);
        return root;
    }
}