class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 && j>=0){
            int val1=num1.charAt(i)-'0';
            int val2=num2.charAt(j)-'0';
            int val=carry+val1+val2;
            sb.append(val%10);
            carry=val/10;
            i--;j--;
        }
        while(i>=0){
            int val=num1.charAt(i--)-'0';
            sb.append(((val+carry)%10));
            carry=(val+carry)/10;
        }
        while(j>=0){
            int val=num2.charAt(j--)-'0';
            sb.append(((val+carry)%10));
            carry=(val+carry)/10;
        }
        if(carry!=0){
            sb.append(1);

        }
        String ans=sb.reverse().toString();
        return ans;


        
    }
}