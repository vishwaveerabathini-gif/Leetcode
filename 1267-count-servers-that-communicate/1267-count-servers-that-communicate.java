class Solution {
    public void check(int[][] grid,int i,int j,HashSet<ArrayList<Integer>> set){
        for(int z=j+1;z<grid[0].length;z++){
            if(grid[i][z]==1){
                ArrayList<Integer> arr1=new ArrayList<>();
                arr1.add(i);
                arr1.add(j);
                ArrayList<Integer> arr2=new ArrayList<>();
                arr2.add(i);
                arr2.add(z);
                if(!set.contains(arr1)){
                    set.add(arr1);
                }
                if(!set.contains(arr2)){
                    set.add(arr2);
                }
            }
        }
        for(int z=i+1;z<grid.length;z++){
            if(grid[z][j]==1){
                ArrayList<Integer> arr1=new ArrayList<>();
                arr1.add(i);
                arr1.add(j);
                ArrayList<Integer> arr2=new ArrayList<>();
                arr2.add(z);
                arr2.add(j);
                if(!set.contains(arr1)){
                    set.add(arr1);
                }
                if(!set.contains(arr2)){
                    set.add(arr2);
                }
            }
        }
        return;
    }
    public int countServers(int[][] grid) {
        int count=0;
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    check(grid,i,j,set);
                }
            }
        }
        return set.size();
    }
}