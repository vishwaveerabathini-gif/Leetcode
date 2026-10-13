class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p=0;int t=0;
        while(p<players.length ){
            while(t<trainers.length){
                if(players[p]<=trainers[t]){
                    count++;
                    t++;
                    break;
                }
                t++;
            }
            if(t>=trainers.length){
                return count;
            }
            p++;
        }
        return count;
    }
}