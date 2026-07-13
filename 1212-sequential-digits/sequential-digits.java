class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> al=new ArrayList<>();
        String s="123456789";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ns=s.substring(i,j+1);
                int num=Integer.valueOf(ns);
                if(num>=low && num<=high){
                    al.add(num);
                }
            }
        }
        Collections.sort(al);
        return al;
        
    }
}