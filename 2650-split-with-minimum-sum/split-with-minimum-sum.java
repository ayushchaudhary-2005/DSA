class Solution {
    public int splitNum(int num) {
        String str=String.valueOf(num);
        if(str.length()==1){
            return Integer.parseInt(str);
        }
         if(str.length()==2){
            int val1=str.charAt(0)-'0';
            int val2=str.charAt(1)-'0';
            return val1+val2;
        }
        char a[]=str.toCharArray();
        Arrays.sort(a);
        int i=0;
        while(i<a.length && (a[i]-'0')==0){
            i++;
        }
        char arr[]=new char[a.length-i];
        int k=0;
        for(int j=i;j<a.length;j++){
            arr[k++]=a[j];

        }
        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();
        i=0;
        boolean flag=true;
        while(i<arr.length){
            if(flag){
                num1.append(arr[i]);
                i++;
            }
            else{
                num2.append(arr[i]);
                i++;
            }
            flag=!flag;
        }
        int val1=0;
        if(!num1.isEmpty()){
            val1=Integer.parseInt(num1.toString());

        }
        int val2=0;
       if(!num2.isEmpty()){
         val2=Integer.parseInt(num2.toString());
       }
        return val1+val2;


        
    }
}