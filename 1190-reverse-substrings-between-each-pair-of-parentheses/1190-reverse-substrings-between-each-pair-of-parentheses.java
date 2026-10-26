class Solution {
    static int idx;
    public String reverseParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        idx=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                idx++;
                ans.append(check(s,i+1));
                i=idx;
            }else if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                ans.append(s.charAt(i));
            }
            i++;
            idx++;
        }
        return ans.toString();
    }
    public String check(String s,int k){
        StringBuilder sb=new StringBuilder();
        while(s.charAt(k)!=')'){
            if(s.charAt(k)=='('){
                idx++;
                sb.append(check(s,k+1));
                k=idx;
            }else{
                sb.append(s.charAt(k));
            }
            k++;
            idx++;
        }
        return sb.reverse().toString();
    }
}