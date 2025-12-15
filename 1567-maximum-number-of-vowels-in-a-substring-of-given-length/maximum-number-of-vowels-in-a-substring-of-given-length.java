class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        int max = 0;
        int cnt = 0;   // maintain vowel count

        while (j < s.length()) {

            char ch = s.charAt(j);
            sb.append(ch);

            // add vowel when expanding window
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt++;
            }

            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {

                max = Math.max(max, cnt);

                // remove left character
                char left = sb.charAt(0);
                if (left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u') {
                    cnt--;
                }

                sb.deleteCharAt(0);
                i++;
                j++;
            }
        }
        return max;
    }
}
