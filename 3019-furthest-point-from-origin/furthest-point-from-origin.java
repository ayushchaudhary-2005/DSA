class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lm=0;
        int rm=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                lm++;
            }
            if(ch=='R'){
                rm++;
            }

        }
        int rem=moves.length()-(lm+rm);
        if(lm>=rm){
            return rem+(lm-rm);

        }
        return rem+(rm-lm);

        
    }
}