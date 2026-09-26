class Solution {
    public void check(int i,int j,String s,StringBuilder sb,HashMap<String,String> map){
        String b=s.substring(i,j);
        if(map.containsKey(b)){
            sb.append(map.get(b));
            return;
        }
        // for(int z=0;z<knowledge.size();z++){
        //     if(knowledge.get(z).get(0).equals(b)){
        //         sb.append(knowledge.get(z).get(1));
        //         map.put(knowledge.get(z).get(0),knowledge.get(z).get(1));
        //         knowledge.remove(z);
        //         return;
        //     }
        // }
        sb.append('?');
    }
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i=0;i<s.length();){
            if(s.charAt(i)=='('){
                int z=i+1;
                while(s.charAt(z)!=')'){
                    z++;
                }
                check(i+1,z,s,sb,map);
                i=z+1;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}