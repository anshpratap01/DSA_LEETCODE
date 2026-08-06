class Solution {
    public int smallestNumber(int n, int t) {
         int ans = 0;
        for(int i = n;i<=100; i++){
            int pro = 1;
            int temp = i;
            //System.out.print(i);
           
            while(temp>0){
                int digit = temp%10;
                pro = pro*digit;
                temp = temp/10;
            }
            if(pro%t == 0)
                return i;
            
        }
        return -1;

        
    }
}