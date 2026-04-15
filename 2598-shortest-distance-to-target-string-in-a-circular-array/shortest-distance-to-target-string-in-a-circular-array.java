class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        // Right direction
        for(int i = 0; i < n; i++){
            int index = (startIndex + i) % n;
            if(words[index].equals(target)){
                ans = i;
                break;
            }
        }

        // Left direction
        for(int i = 0; i < n; i++){
            int index = (startIndex - i + n) % n;
            if(words[index].equals(target)){
                ans = Math.min(ans, i);
                break;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}