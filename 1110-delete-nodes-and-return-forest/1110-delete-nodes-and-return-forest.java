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
    public TreeNode traverse(TreeNode root,int[] to_delete,ArrayList<TreeNode> arr){
        if(root==null){
            return null;
        }
        root.left=traverse(root.left,to_delete,arr);
        root.right=traverse(root.right,to_delete,arr);
        for(int x:to_delete){
            if(x==root.val){
                // if(root.left!=null){
                //     arr.add(root.left);
                // }
                // if(root.right!=null){
                //     arr.add(root.right);
                // }
                if(root.left!=null && root.right!=null){
                    arr.add(root.left);
                    arr.add(root.right);
                }else if(root.left!=null){
                    arr.add(root.left);
                }else if(root.right!=null){
                    arr.add(root.right);
                }else{
                    
                }
                return null;
            }
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ArrayList<TreeNode> arr=new ArrayList<>();
        root=traverse(root,to_delete,arr);
        if(root!=null){
            arr.add(root);
        }
        return arr;
    }
}