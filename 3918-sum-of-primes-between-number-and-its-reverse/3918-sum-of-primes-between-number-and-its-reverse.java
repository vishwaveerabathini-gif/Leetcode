class Solution {
    public int prime(int i,int count){
        for(int j=3;j<(i/2);j+=2){
            if(i%j==0){
                return 0;
            }
        }
        return i;
    }
    public int sumOfPrimesInRange(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 2;
        }
        int m=0;
        int k=n;
        int count=0;
        int w=Integer.toString(n).length();
        while(k>0){
            m+=(Math.pow(10,w-1))*(k%10);
            w--;
            k/=10;
        }
        int start=Math.min(n,m);
        int end=Math.max(n,m);
        int r=start;
        if(start==2){
            count+=2;
            start+=1;
        }else if(start==1){
            start+=2;
            count+=2;
        }else{}
        if(start%2==0){
            start++;
        }
        for(int i=start;i<=end;i+=2){
            count+=prime(i,0);
        }
        System.out.print(count);
        return count;
    }
}