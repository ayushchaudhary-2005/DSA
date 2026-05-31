class Solution {
    class Pair{
        int idx;
        char bracket;
        public Pair(int idx,char bracket){
            this.idx=idx;
            this.bracket=bracket;
        }
    }
    public String minRemoveToMakeValid(String s) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='('){
                st.push(new Pair(i,curr));
            }
            else if(st.isEmpty() && curr==')'){
                al.add(i);
            }
            else if(!st.isEmpty() && curr==')'){
                st.pop();
            }
        }
        while(!st.isEmpty()){
            al.add(st.pop().idx);
        }
        int arr[]=new int[s.length()];
        Arrays.fill(arr,-1);
        for(int i=0;i<al.size();i++){
            arr[al.get(i)]=al.get(i);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else{
                if(arr[i]==-1){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();


        
    }
}