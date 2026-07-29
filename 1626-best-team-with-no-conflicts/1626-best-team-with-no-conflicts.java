class Solution {
    public int find(int arr[][],int idx,int prevAgeIdx,int dp[][]){
        if(idx==arr.length){
            return 0;
        }
        if(prevAgeIdx!=-1 && dp[prevAgeIdx][idx]!=-1){
                return dp[prevAgeIdx][idx];
        }
        int take=0;
        if(prevAgeIdx==-1 || arr[idx][1]==arr[prevAgeIdx][1] || (arr[idx][0]>=arr[prevAgeIdx][0])){
            take=arr[idx][0]+find(arr,idx+1,idx,dp);
        }
        int notTake=find(arr,idx+1,prevAgeIdx,dp);
        if(prevAgeIdx!=-1){
            dp[prevAgeIdx][idx]=Math.max(take,notTake);
        }
        return Math.max(take,notTake);

    }
    public int bestTeamScore(int[] scores, int[] ages) {
        int arr[][]=new int[scores.length][2];
        int dp[][]=new int[1001][1001];
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<scores.length;i++){
            arr[i][0]=scores[i];
            arr[i][1]=ages[i];
        }
        Arrays.sort(arr,(a,b)->{if(a[1]==b[1]){
              return a[0]-b[0];
        }
        return a[1]-b[1];
        });
        return find(arr,0,-1,dp);
        
    }
}