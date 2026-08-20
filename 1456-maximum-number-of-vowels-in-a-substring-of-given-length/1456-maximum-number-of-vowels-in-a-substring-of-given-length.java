class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet(Arrays.asList('a','e','i','o','u'));
        int count=0;
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int j=k;j<s.length();j++){
            if(set.contains(s.charAt(j-k))){
                max--;
            }
            if(set.contains(s.charAt(j))){
                max++;
            }
            count=Math.max(count,max);
        }
        return count;
    }
}