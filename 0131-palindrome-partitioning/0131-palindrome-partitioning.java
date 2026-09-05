class Solution {
    public boolean isPalindrome(String str,int s,int e){
        if(s==e){
            return true;
        }
        while(e>s){
            if(str.charAt(s)!=str.charAt(e)){
                return false;

            }
            e--;
            s++;

        }
        return true;
    }
    public void find(String s,int idx,List<List<String>> ans,List<String> al){
        if(idx==s.length()){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                al.add(s.substring(idx,i+1));
                find(s,i+1,ans,al);
                al.remove(al.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> al=new ArrayList<>();
        find(s,0,ans,al);
        return ans;
        
    }
}