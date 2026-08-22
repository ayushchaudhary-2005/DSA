class Solution {
    public int find(int n){
        int sum=0;
        int p=1;
        while(n>0){
            sum=sum+n%10;
            p=p*(n%10);
            n=n/10;
        }

        return sum+p;
    }
    public boolean checkDivisibility(int n) {
        int ds=find(n);
        if(n%ds==0){
            return true;
        }
        return false;
        
    }
}