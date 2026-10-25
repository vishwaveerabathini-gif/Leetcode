class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            String l=check(s,i,i);
            String m=check(s,i,i+1);
            if(m.length()>=l.length() && m.length()>ans.length()){
                ans=m;
            }else if(l.length()>m.length() && l.length()>ans.length()){
                ans=l;
            }else{
                
            }
        }
        return ans;
    }
    public String check(String s,int st,int end){
        while(st>=0 && end<s.length() &&(s.charAt(st)==s.charAt(end))){
            st--;end++;
        }
        
        return s.substring(st+1,end);
    }
}