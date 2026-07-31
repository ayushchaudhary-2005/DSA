class Solution {
    public int minimumPushes(String word) {
        int arr[]=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']=arr[ch-'a']+1;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        int ans=0;
        int it=1;
        for(int i=0;i<arr.length;i++){
            if(i!=0 && i%8==0){
                it++;
            }
            if(arr[i]!=0){
                ans=ans+(it*arr[i]);
            }
        }
        return ans;
    }
}