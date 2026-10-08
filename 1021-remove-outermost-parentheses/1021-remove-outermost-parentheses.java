class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        int i=0;
        int z=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                if(z==0){
                    stack.push(s.charAt(i));
                }else{
                    sb.append(s.charAt(i));
                }
                z++;
            }else{
                z--;
                if(z==0){
                    stack.pop();
                }else{
                    sb.append(s.charAt(i));
                }
            }
            i++;
        }
        s=sb.toString();
        return s;
    }
}