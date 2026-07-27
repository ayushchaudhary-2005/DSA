class Solution {
    public boolean isValid(String word1,String word2){
        if(word2.length()-word1.length()!=1){
            return false;
        }
        int diff=0;
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            if(word1.charAt(i)!=word2.charAt(j)){
                diff++;
                j++;
            }
            else{
                i++;j++;
            }
        }
        if(diff<=1){
            return true; 
        }
        return false;
    }
    public int find(String arr[],int prevIdx,int idx,int dp[][]){
        if(idx==arr.length){
            return 0;
        }
        if(prevIdx!=-1 && dp[prevIdx][idx]!=-1){
            return dp[prevIdx][idx];
        }
        int take=0;
        if(prevIdx==-1 || isValid(arr[prevIdx],arr[idx])){
            take=1+find(arr,idx,idx+1,dp);
        }
        int notTake=find(arr,prevIdx,idx+1,dp);
        if(prevIdx!=-1){
            dp[prevIdx][idx]=Math.max(take,notTake);
        }
        return Math.max(take,notTake);

    }
    public int longestStrChain(String[] arr) {
        Arrays.sort(arr,(a,b)->a.length()-b.length());
        int dp[][]=new int[1001][1001];
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(arr,-1,0,dp);
    }
}