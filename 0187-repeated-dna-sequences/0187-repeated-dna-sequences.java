class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // // HashSet<Integer> set=new HashSet<>();
        // ArrayList<String> arr=new ArrayList<>();
        // for(int i=0;i<10;i++){
        //     if(map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i),map.get(s.charAt(i))+1);
        //     }else{
        //         map.put(s.charAt(i),1);
        //     }
        // }
        // for(int x:map.values()){
        //     set.add(x);
        // }
        // if(set.size()==1){
        //     arr.add(s.substring(0,10));
        // }
        // int y=0;
        // int z=10;
        // while(z==s.length()){
        //     map.put(s.charAt(y),map.get(s.charAt(y))-1);
        //     if(map.containsKey(s.charAt(z))){
        //         map.put(s.charAt(z),map.get(s.charAt(z))+1);
        //     }else{
        //         map.put(s.charAt(z),1);
        //     }
        //     set.add(map.get(s.charAt(y)));
        //     set.add(map.get(s.charAt(z)));
        //     if(set.size()==1){
        //         arr.add(s.substring(y+1,z+1));
        //     }
        //     y++;
        //     z++;
        // }
        // return arr;
        ArrayList<String> arr=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<10 && i<s.length();i++){
            sb.append(s.charAt(i));
        }
        map.put(sb.toString(),1);
        int z=10;
        while(z<s.length()){
            sb.deleteCharAt(0);
            sb.append(s.charAt(z));
            String r=sb.toString();
            if(map.containsKey(r)){
                map.put(r,map.get(r)+1);
            }else{
                map.put(r,1);
            }
            z++;
        }
        for(String x:map.keySet()){
            if(map.get(x)>=2){
                arr.add(x);
            }
        }
        return arr;
    }
}