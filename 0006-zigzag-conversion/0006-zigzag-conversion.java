class Solution {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Character>> arr=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Character> a=new ArrayList<>();
            arr.add(a);
        }
        if(numRows==1){
            return s;
        }
        int i=0;
        int idx=1;
        arr.get(0).add(s.charAt(0));
        while(idx<s.length()){
            if(i<numRows){
                for(int j=1;j<numRows;j++){
                    if(idx<s.length()){
                        arr.get(j).add(s.charAt(idx));
                    }
                    idx++;
                }
                i+=numRows;
            }else{
                for(int j=numRows-2;j>=0;j--){
                    if(idx<s.length()){
                        arr.get(j).add(s.charAt(idx));
                    }
                    idx++;
                }
                i=0;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int z=0;z<arr.size();z++){
            for(char x:arr.get(z)){
                sb.append(x);
            }
        }
        return sb.toString();
    }
}