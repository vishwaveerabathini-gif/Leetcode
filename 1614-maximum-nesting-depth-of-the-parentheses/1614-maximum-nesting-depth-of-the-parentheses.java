class Solution {
    public int maxDepth(String s) {
        ArrayList<Integer> arr=new ArrayList<>();
        int z=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                z++;
                arr.add(z);
            }else if(s.charAt(i)==')'){
                z--;
                arr.add(z);
            }else{
                continue;
            }
        }
        Collections.sort(arr);
        if(arr.size()>=1){
             return arr.get(arr.size()-1);
        }else{
            return 0;
        }
       
    }
}