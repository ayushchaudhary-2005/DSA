class Solution {
    public int[] resultArray(int[] arr) {
        int ans[]=new int[arr.length];
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al1.add(arr[0]);
        al2.add(arr[1]);
        for(int i=2;i<arr.length;i++){
            if(al1.get(al1.size()-1)>al2.get(al2.size()-1)){
                al1.add(arr[i]);
            }
            else{
                al2.add(arr[i]);
            }
        }
        int i=0;
        for(;i<al1.size();i++){
            ans[i]=al1.get(i);
        }
        for(int j=0;j<al2.size();j++){
            ans[i++]=al2.get(j);
        }
        return ans;
        
    }
}