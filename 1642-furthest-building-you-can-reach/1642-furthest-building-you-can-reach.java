class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                ans = i + 1;
                continue;
            }
            int diff = arr[i + 1] - arr[i];

            // Always use bricks first
            bricks -= diff;
            pq.add(diff);

            // If bricks become negative, replace the largest brick jump by a ladder
            if (bricks < 0) {
                if (ladders > 0) {
                    bricks += pq.poll();
                    ladders--;
                } else {
                    return i;
                }
            }
            ans = i + 1;
        }
        return ans;
    }
}