class Solution {
    public void duplicateZeros(int[] arr) {
        // pass 1: count zeros
        int zeros = 0;
        for (var n : arr) if (n == 0) zeros++;

        // pass 2: insert double zeros
        int length = arr.length, p = length - 1, q = p + zeros;
        while (p >= 0 && p < q) {
            if (q < length) arr[q] = arr[p];
            q -= 1;
            if (arr[p] == 0) {
                if (q < length) arr[q] = arr[p];
                q -= 1;
            }
            p -= 1;
        }
    }
    

}