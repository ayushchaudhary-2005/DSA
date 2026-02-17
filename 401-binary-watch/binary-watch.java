class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        if(turnedOn>=9){
            return new ArrayList<>();
        }
        ArrayList<String> al=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                int bitCounts=Integer.bitCount(h)+Integer.bitCount(m);
                if(bitCounts==turnedOn){
                    al.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return al;

        
    }
}