class Solution {
    public boolean find(char arr[][],String word,int r,int c,String s,int idx){
        if(s.length()==word.length()){
            return true;
        }
        if((r<=-1 || r>=arr.length || c<=-1 || c>=arr[0].length || word.charAt(idx)!=arr[r][c]) || arr[r][c]=='.'){ 
            return false;
            
        }
        char prev=arr[r][c];
        arr[r][c]='.';
        boolean left=find(arr,word,r,c-1,s+word.charAt(idx),idx+1);
        boolean right=find(arr,word,r,c+1,s+word.charAt(idx),idx+1);
        boolean up=find(arr,word,r-1,c,s+word.charAt(idx),idx+1);
        boolean down=find(arr,word,r+1,c,s+word.charAt(idx),idx+1);
        arr[r][c]=prev;
        return (left|| right || up || down);
    }
    public boolean exist(char[][] arr, String word) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==word.charAt(0)){
                    if(find(arr,word,i,j,"",0)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}