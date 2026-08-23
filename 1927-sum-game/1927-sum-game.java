class Solution {
    public boolean sumGame(String num) {
        int left=0;
        int right=0;
        int le=0;
        int ri=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)!='?'){
                left+=num.charAt(i)-'0';
            }else{
                le++;
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)!='?'){
                right+=num.charAt(i)-'0';
            }else{
                ri++;
            }
        }
        if((le+ri)%2!=0){
            return true;
        }
        int ld=left-right;
        int lq=ri-le;
        return ld!=(lq/2)*9;
    }
}