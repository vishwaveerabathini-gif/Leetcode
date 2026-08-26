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
    static int c;
    public void traverse(int[] preorder,int index,TreeNode root,TreeNode s){
        if(root==null){
            return;
        }
        if(root.val>preorder[index]){
            traverse(preorder,index,root.left,s);
            if(c==0){
                root.left=s;
                c++;
            }
        }else{
            traverse(preorder,index,root.right,s);
            if(c==0){
                root.right=s;
                c++;
            }
        }
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            c=0;
            TreeNode s=new TreeNode(preorder[i]);
            traverse(preorder,i,root,s);
        }
        return root;
    }
}