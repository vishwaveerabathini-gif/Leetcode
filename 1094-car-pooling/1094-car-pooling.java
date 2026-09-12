class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips,(a,b)->Integer.compare(a[1],b[1]));
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=trips[0][0];
        ArrayList<Integer> arr=new ArrayList<>();
        map.put(trips[0][2],trips[0][0]);
        for(int i=1;i<trips.length;i++){
            if(count>capacity){
                return false;
            }
            for(int x:map.keySet()){
                if(trips[i][1]>=x){
                    count-=map.get(x);
                    arr.add(x);
                }
            }
            for(int x:arr){
                if(map.containsKey(x)){
                    map.remove(x);
                }
                
            }
            if(map.containsKey(trips[i][2])){
                map.put(trips[i][2],map.get(trips[i][2])+trips[i][0]);
            }else{
                map.put(trips[i][2],trips[i][0]);
            }
            count+=trips[i][0];
        }
        if(count>capacity){
            return false;
        }
        return true;
    }
}