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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        TreeNode n1=new TreeNode(0);
        TreeNode n2=new TreeNode(0);
        for(int i=0;i<descriptions.length;i++){
            if(map.containsKey(descriptions[i][0]) && map.containsKey(descriptions[i][1])){
                n1=map.get(descriptions[i][0]);
                n2=map.get(descriptions[i][1]);
                set.add(n2.val);
            }
            else if(map.containsKey(descriptions[i][0])){
                n1=map.get(descriptions[i][0]);
                n2=new TreeNode(descriptions[i][1]);
                map.put(descriptions[i][1],n2);
                set.add(n2.val);
            }else if(map.containsKey(descriptions[i][1])){
                n1=new TreeNode(descriptions[i][0]);
                n2=map.get(descriptions[i][1]);
                map.put(descriptions[i][0],n1);
                set.add(n2.val);
            }else{
                n1=new TreeNode(descriptions[i][0]);
                n2=new TreeNode(descriptions[i][1]);
                map.put(descriptions[i][1],n2);
                map.put(descriptions[i][0],n1);
                set.add(n2.val);
            }
            if(descriptions[i][2]==1){
                n1.left=n2;
            }else{
                n1.right=n2;
            }
        }
        for(int x:map.keySet()){
            if(!set.contains(x)){
                return map.get(x);
            }
        }
        return null;
    }
}