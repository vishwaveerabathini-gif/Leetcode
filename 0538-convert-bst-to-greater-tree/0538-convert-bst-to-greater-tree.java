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
    public TreeNode traverse(TreeNode root,HashSet<Integer> map){
        if(root==null){
            return null;
        }
        root.right=traverse(root.right,map);
        if(!map.contains(root.val)){
            map.add(root.val);
        }
        int s=0;
        for(int x:map){
            if(root.val<=x){
                s+=x;
            }
        }
        root.val=s;
        root.left=traverse(root.left,map);
        return root;
    }
    public TreeNode convertBST(TreeNode root) {
        HashSet<Integer> map=new HashSet<>();
         return traverse(root,map); 
    }
}