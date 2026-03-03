class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count =0;
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int currWt=0;
        while(s<=e){
            if(s==e){
                people[e]=0;
            }
            if(people[s]+people[e]==limit){
                count++;
                s++;
                e--;
            }
            else if((people[s]+people[e])>limit){
                count++;
                 e--;
            }
            else{
                s++;
                e--;
                count++;
            }
        }
        return count==0?1:count;
        
    }
};