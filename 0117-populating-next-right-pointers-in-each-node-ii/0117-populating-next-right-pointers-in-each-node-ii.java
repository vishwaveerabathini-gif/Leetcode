/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node temp=root;
        Queue<Node> q=new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            int i=q.size();
            for(int j=0;j<i;j++){
                Node p=q.poll();
                if(j==(i-1) && p!=null){
                    p.next=null;
                }else{
                    if(p!=null){
                        p.next=q.peek();
                    }
                }
                if(p!=null &&p.left!=null){
                    q.add(p.left);
                }
                if(p!=null && p.right!=null){
                    q.add(p.right);
                }
            }
        }
        return root;
    }
}