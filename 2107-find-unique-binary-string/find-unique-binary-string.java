class Solution {
    public void find(String arr[],int n,String curr,int len,ArrayList<String> al){
        if(len==n){
           al.add(curr);
            return;
        }
       find(arr,n,curr+'0',len+1,al);
       find(arr,n,curr+"1",len+1,al);
    }
    public String findDifferentBinaryString(String[] arr) {
        String curr=arr[0];
        int len=curr.length();
        ArrayList<String> al=new ArrayList<>();
        find(arr,len,"",0,al);
        for(int i=0;i<al.size();i++){
            boolean found=false;
            String s=al.get(i);
            for(int j=0;j<arr.length;j++){
                if(arr[j].equals(s)){
                    found=true;
                    break;
                }
            }
            if(!found){
                return s;
            }
        }
        return "";
        
    }
}