class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> ans=new ArrayList<>();
        List<String> a=new ArrayList<>();
        HashMap<String,HashMap<String,Integer>> map=new HashMap<>();
        for(List<String> x: orders){
            if(!a.contains(x.get(2))){
                a.add(x.get(2));
            }
            if(!map.containsKey(x.get(1))){
                map.put(x.get(1),new HashMap<String,Integer>());
            }
            if(!map.get(x.get(1)).containsKey(x.get(2))){
                map.get(x.get(1)).put(x.get(2),1);
            }else{
                map.get(x.get(1)).put(x.get(2),map.get(x.get(1)).get(x.get(2))+1);
            }
        }
        Collections.sort(a);
        a.add(0,"Table");
        ans.add(a);
        ArrayList<String> aa=new ArrayList<>();
        for(String x:map.keySet()){
            aa.add(x);
        }
        Collections.sort(aa,(x,y)->Integer.parseInt(x)-Integer.parseInt(y));
        for(String x:aa){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(x);
            for(int i=1;i<a.size();i++){
                if(map.get(x).containsKey(a.get(i))){
                    arr.add(Integer.toString(map.get(x).get(a.get(i))));
                }else{
                    arr.add("0");
                }
            }
            ans.add(arr);
        }
        return ans;
    }
}