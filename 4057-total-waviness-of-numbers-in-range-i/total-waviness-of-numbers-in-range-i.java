class Solution {
    public int totalWaviness(int num1, int num2) {

        int ans=0;
        for(int i=num1;i<=num2;i++){
            String s=String.valueOf(i);
            if(!(s.length()<=2)){
                char arr[]=s.toCharArray();
                for(int j=1;j<arr.length-1;j++){
                    if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                        ans++;
                    }
                    if(arr[j]<arr[j-1] && arr[j]<arr[j+1]){
                        ans++;
                    }
                }

            }

        }
        return ans;
        
    }
}