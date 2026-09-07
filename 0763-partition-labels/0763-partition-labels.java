class Solution {
    public List<Integer> partitionLabels(String s) {
        int min=0;
        int max=0;
        int z=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            max=Math.max(max,s.lastIndexOf(s.charAt(i)));
            if(i==max){
                if(z==0){
                    arr.add(i+1);
                    z++;
                }else{
                    arr.add(i-min);
                }
                min=max;
            }
        }
        return arr;
    }
}