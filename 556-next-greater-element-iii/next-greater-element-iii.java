class Solution {
    public int nextGreaterElement(int n) {

        char[] arr = String.valueOf(n).toCharArray();

        // 1. Find pivot
        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // No greater permutation
        if (i < 0) {
            return -1;
        }

        // 2. Find smallest digit greater than arr[i]
        int j = arr.length - 1;

        while (arr[j] <= arr[i]) {
            j--;
        }

        // 3. Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // 4. Reverse everything after i
        reverse(arr, i + 1, arr.length - 1);

        long result = Long.parseLong(new String(arr));

        // Integer overflow check
        if (result > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) result;
    }

    private void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}