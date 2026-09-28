class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                count++;
            }if(x==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        return max;
    }
}