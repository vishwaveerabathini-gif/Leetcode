class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            if(!map.containsKey(logs[i][0])){
                map.put(logs[i][0],new HashSet<Integer>());
            }
            map.get(logs[i][0]).add(logs[i][1]);
        }
        int[] ans=new int[k];
        for(int x:map.keySet()){
            ans[map.get(x).size()-1]+=1;
        }
        return ans;
    }
}