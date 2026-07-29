class Solution {
    public int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];}
        );
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[0][1]);
        for(int i=1;i<arr.length;i++){
            int h=arr[i][1];
            int s=0;
            int e=al.size()-1;
            while(s<=e){
            int mid=s+(e-s)/2;
            if(al.get(mid)==h){
                s=mid;
                break;
            }
            else if(al.get(mid)<h){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            }
            if(s==al.size()){
                al.add(h);
            }
            else{
                al.set(s,h);
            }
        }
        return al.size();
        
    }
}