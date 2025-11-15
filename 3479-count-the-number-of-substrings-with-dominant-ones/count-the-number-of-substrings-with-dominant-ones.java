class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        int[] cumCountOne = new int[n];

        
        if (s.charAt(0) == '1') {
            cumCountOne[0] = 1;
        } else {
            cumCountOne[0] = 0;
        }

        for (int i = 1; i < n; i++) {
            int add = 0;
            if (s.charAt(i) == '1') {
                add = 1;
            }
            cumCountOne[i] = cumCountOne[i - 1] + add;
        }

        int result = 0;

        
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int oneCount;
                if (i > 0) {
                    oneCount = cumCountOne[j] - cumCountOne[i - 1];
                } else {
                    oneCount = cumCountOne[j];
                }

                int length = j - i + 1;
                int zeroCount = length - oneCount;
                int z2 = zeroCount * zeroCount;

                
                if (z2 > oneCount) {

                    int waste = z2 - oneCount;
                    j = j + waste - 1;  

                } else {

                
                    result = result + 1;

                    if (z2 < oneCount) {
                       
                        double root = Math.sqrt(oneCount);
                        int temp = (int) root;
                        int k = temp - zeroCount;
                        int next = j + k;

                        if (next >= n) {
                            result = result + (n - j - 1);
                            break;
                        } else {
                            result = result + k;
                        }

                        j = next;
                    }
                }
            }
        }

        return result;
    }
}
