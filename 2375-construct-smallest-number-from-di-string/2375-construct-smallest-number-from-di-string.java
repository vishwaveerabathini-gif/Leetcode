class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<pattern.length()){
            if(pattern.charAt(i)=='I'){
                sb.append(Integer.toString(i+1));
                i++;
            }else{
                int j=i;
                while(j<pattern.length() &&pattern.charAt(j)!='I'){
                    j++;
                }
                int r=j;
                while(i!=j){
                    sb.append(Integer.toString(r+1));
                    i++;
                    r--;
                }
                sb.append(Integer.toString(r+1));
                i=j+1;
            }
        }
        if((sb.length())!=pattern.length()+1){
            if(pattern.charAt(pattern.length()-1)=='I'){
                sb.append(Integer.toString(i+1));
            }else{
                sb.append(Integer.toString(i-1));
            }
        }
        return sb.toString();
    }
}