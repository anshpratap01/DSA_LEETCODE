class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int pro = 1;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            pro = pro*digit;
            sum = sum+digit;
            n = n/10;
        }
        //System.out.println(sum);
        //System.out.print(pro);
         return org % (sum + pro) == 0;
    }
}