class Solution {
    public void find(int n,List<String> ans,String curr,int o,int c){
        if(o<c){
            return;
        }
        if(o==n && c==n){
            ans.add(curr);
            return;
        }
        if(o<n){
        find(n,ans,curr+'(',o+1,c);
        }
        find(n,ans,curr+')',o,c+1);

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        find(n,ans,"",0,0);
        return ans;
        
    }
}