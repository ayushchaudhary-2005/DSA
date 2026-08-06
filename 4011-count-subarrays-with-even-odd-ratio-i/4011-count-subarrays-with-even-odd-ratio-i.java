class Solution {
    public int countRatioSubarrays(int[] arr, int a, int b) {
        int ans=0;
        double aa=a;
        double bb=b;
        for(int i=0;i<arr.length;i++){
            double oc=0;
            double ec=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]%2==0){
                    ec++;
                }
                else{
                    oc++;
                }
                if(oc!=0){
                    if((ec/oc)<=(aa/bb)){
                        ans++;
                    }
                }
            }
        }
        return ans;
        
    }
}