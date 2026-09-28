class Solution {
    public void check(int i,List<List<Integer>> arr){
        List<Integer> a=new ArrayList<>();
        int s=1;
        a.add(1);
        int k=0;
        while(s!=arr.get(i-1).size()){
            if(k==0){
                a.add(1+arr.get(i-1).get(s));
                k++;
            }else{
            a.add(arr.get(i-1).get(s-1)+arr.get(i-1).get(s));
            }
            s++;
        }
        a.add(1);
        arr.add(a);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        arr.add(a);
        for(int i=1;i<numRows;i++){
            check(i,arr);
        }
        return arr;
    }
}