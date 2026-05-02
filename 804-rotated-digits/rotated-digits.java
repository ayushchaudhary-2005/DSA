class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (check(i)) cnt++;
        }
        return cnt;
    }

    private boolean check(int num) {
        boolean isValid = true;
        boolean canChange = false;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 3 || rem == 4 || rem == 7) {
                isValid = false;
                break;
            } else if (rem == 2 ||rem == 5 || rem == 6 || rem == 9) {
                canChange = true;
            }
            num /= 10;
        }
        if (isValid && canChange) return true;
        return false;
    }
}