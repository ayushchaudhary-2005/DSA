class Solution {
    public int countCommas(int n) {
        int ans=0;
        if(n>=1000 && n==10000){
            ans=ans+9000+1;
            System.out.println(ans);
        }
        else if(n>=1000 && n<10000){
            ans=ans+n-1000+1;
             System.out.println(ans);
            }
        else if(n>=10000 && n==100000){
            ans=ans+99001;
             System.out.println(ans);
        }
        else if(n>=10000 && n<100000){
            ans=ans+n-1000+1;
             System.out.println(ans);
        }
        return ans;
        
    }
}