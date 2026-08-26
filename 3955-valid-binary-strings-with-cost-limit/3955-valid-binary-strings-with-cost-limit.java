class Solution {
    public List<String> generateValidStrings(int n, int k) {
        ArrayList<String> arr=new ArrayList<>();
        int m=(int)Math.pow(2,n);
        for(int z=0;z<m;z++){
            int count=0;
            int ccc=0;
            String b=Integer.toBinaryString(z);
            while(b.length()!=n){
                b='0'+b;
            }
            for(int i=0;i<b.length()-1;i++){
                if(b.charAt(i)=='1' && b.charAt(i+1)=='1'){
                    ccc++;
                    break;
                }
                if(b.charAt(i)=='1'){
                    count+=i;
                }
            }
            if(b.charAt(b.length()-1)=='1'){
                count+=b.length()-1;
            }
            if(count<=k && ccc==0){
                arr.add(b);
            }
        }
        return arr;
    }
}