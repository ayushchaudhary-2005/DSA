class Solution {
    public int minimumDifference(int[] nums) {
        int n = nums.length / 2;
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int[] left = Arrays.copyOfRange(nums, 0, n);
        int[] right = Arrays.copyOfRange(nums, n, 2*n);

        // Store subset sums grouped by size
        List<Integer>[] leftSums = new ArrayList[n + 1];
        List<Integer>[] rightSums = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            leftSums[i] = new ArrayList<>();
            rightSums[i] = new ArrayList<>();
        }

        // Generate subsets using recursion
        generate(left, 0, 0, 0, leftSums);
        generate(right, 0, 0, 0, rightSums);

        // Sort right side lists for binary search
        for (int i = 0; i <= n; i++) {
            Collections.sort(rightSums[i]);
        }

        int answer = Integer.MAX_VALUE;

        for (int k = 0; k <= n; k++) {

            List<Integer> list1 = leftSums[k];
            List<Integer> list2 = rightSums[n - k];

            for (int sum1 : list1) {

                int target = totalSum / 2 - sum1;

                int idx = Collections.binarySearch(list2, target);

                if (idx < 0) idx = -idx - 1;

                if (idx < list2.size()) {
                    int sum2 = list2.get(idx);
                    int current = Math.abs(totalSum - 2 * (sum1 + sum2));
                    answer = Math.min(answer, current);
                }

                if (idx - 1 >= 0) {
                    int sum2 = list2.get(idx - 1);
                    int current = Math.abs(totalSum - 2 * (sum1 + sum2));
                    answer = Math.min(answer, current);
                }
            }
        }

        return answer;
    }

    private void generate(int[] arr, int index, int count, int sum, List<Integer>[] result) {
        if (index == arr.length) {
            result[count].add(sum);
            return;
        }

        // Include
        generate(arr, index + 1, count + 1, sum + arr[index], result);

        // Exclude
        generate(arr, index + 1, count, sum, result);
    }
}
