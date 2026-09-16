class Solution {
    public void decrease(int[] arr){
        for(int i=0;i<arr.length;i++){
            int z=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(z<arr[j]){
                    int temp=z;
                    z=arr[j];
                    arr[j]=temp;
                }
            }
            arr[i]=z;
        }
        // Arrays.sort(arr,(a,b)->(b-a));
    }
    public int[][] sortMatrix(int[][] grid) {
        int i=grid.length-1;
        while(i>=0){
            int[] arr=new int[grid.length-i];
            int z=0;
            int s=i;
            while(s<grid.length){
                arr[z]=grid[s][z];
                s++;z++;
            }
            decrease(arr);
            z=0;s=i;
            while(s<grid.length){
                grid[s][z]=arr[z];
                s++;z++;
            }
            i--;
        }
        i=1;
        while(i<grid.length){
            int[] arr=new int[grid.length-i];
            int z=0;
            int s=i;
            while(s<grid.length){
                arr[z]=grid[z][s];
                z++;s++;
            }
            Arrays.sort(arr);
            z=0;
            s=i;
            while(s<grid.length){
                grid[z][s]=arr[z];
                z++;s++;
            }
            i++;
        }
        return grid;
    }
}