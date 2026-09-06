class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i]==1){
                for(int j=i;j<obstacleGrid[0].length;j++){
                    dp[0][i]=0;
                }
                break;
            }else{
                dp[0][i]=1;
            }
        }
        for(int i=1;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]!=1){
                dp[i][0]=dp[i-1][0];
            }else{
                dp[i-1][0]=0;
            }
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]!=1){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}