public class Solution {
    public bool IsPalindrome(int x) {
        if(x<0){
            return false;
        }
        int number=x;
        int pow=0;
        int generatedNum=0;
        while(x>0){
            int val=x%10;
            generatedNum=generatedNum*(int)Math.Pow(10,1)+val;
            x=x/10;

        }
        return number==generatedNum?true:false;
        
    }
}