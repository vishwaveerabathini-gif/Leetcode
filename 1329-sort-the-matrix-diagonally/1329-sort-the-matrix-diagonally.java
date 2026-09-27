class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int i=mat.length-1;
        if(mat.length<=mat[0].length){
            while(i>=0){
                ArrayList<Integer> arr=new ArrayList<>();
                int z=0;
                int s=i;
                while(s<mat.length){
                    arr.add(mat[s][z]);
                    s++;z++;
                }
                Collections.sort(arr);
                z=0;s=i;
                while(s<mat.length){
                    mat[s][z]=arr.get(z);
                    s++;z++;
                }
                i--;
            }
        }else{
            while(i>=0){
                ArrayList<Integer> arr=new ArrayList<>();
                int z=0;
                int s=i;
                while(s<mat.length && z<mat[0].length){
                    arr.add(mat[s][z]);
                    s++;z++;
                }
                Collections.sort(arr);
                z=0;s=i;
                while(s<mat.length && z<mat[0].length){
                    mat[s][z]=arr.get(z);
                    s++;z++;
                }
                i--;
            }
        }
        i=1;
        if(mat[0].length<mat.length){
            while(i<mat[0].length){
                ArrayList<Integer> arr=new ArrayList<>();
                int z=0;
                int s=i;
                while(s<mat[0].length && z<mat.length){
                    arr.add(mat[z][s]);
                    z++;s++;
                }
                Collections.sort(arr);
                z=0;
                s=i;
                while(s<mat[0].length && z<mat.length){
                    mat[z][s]=arr.get(z);
                    z++;s++;
                }
                i++;
            }
        }else{
            while(i<mat[0].length){
                ArrayList<Integer> arr=new ArrayList<>();
                int z=0;
                int s=i;
                while(z<mat.length && s<mat[0].length){
                    arr.add(mat[z][s]);
                    z++;s++;
                }
                Collections.sort(arr);
                z=0;
                s=i;
                while(z<mat.length && s<mat[0].length){
                    mat[z][s]=arr.get(z);
                    z++;s++;
                }
                i++;
            }
        }
        return mat;
    }
}