class Solution {
    public int totalMoney(int n) {
        int week = n/7;
        
        int first = 28;
        int last =  28 + (week - 1) * 7;
        int result = week * (first + last) / 2;

        int start_money = 1 + week;

        for(int day = 1; day <= (n%7); day++) {
            result += start_money;
            start_money++;
        }

        return result;
    }
}