class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && k!=i){
                        int val=digits[i]+digits[j]*10+digits[k]*100;
                        if(val>99 && val%2==0){
                            st.add(val);
                        }
                    }
                }
            }
        }
        return st.size();
    }
}