class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();){
            int start=i;
            char ch=s.charAt(i);
            int idx=hm.get(ch);
            int c=idx-start+1;
            for(int j=i;j<idx;j++){
                char currCh=s.charAt(j);
                int currIdx=hm.get(currCh);
                if((currIdx-start+1)>c){
                    c=currIdx-start+1;
                    idx=currIdx;
                }
            }
            ans.add(c);
            i=idx+1;
        }
        return ans;
        
    }
}