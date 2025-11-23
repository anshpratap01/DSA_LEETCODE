class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int one1 = 20000, one2 = 20000;
        int two1 = 20000, two2 = 20000;

        for (int num : nums) {
            sum += num;
            
            if (num % 3 == 1) {
                if (num < one1) {
                    one2 = one1;
                    one1 = num;
                } else if (num < one2) {
                    one2 = num;
                }
            } else if (num % 3 == 2) {
                if (num < two1) {
                    two2 = two1;
                    two1 = num;
                } else if (num < two2) {
                    two2 = num;
                }
            }
        }

        if (sum % 3 == 0) return sum;

        if (sum % 3 == 1) {
            return sum - Math.min(one1, two1 + two2);
        }

        if (sum % 3 == 2) {
            return sum - Math.min(two1, one1 + one2);
        }

        return 0;
        
    }
}