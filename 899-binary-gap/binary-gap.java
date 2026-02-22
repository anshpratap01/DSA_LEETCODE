class Solution {
    public int binaryGap(int n) {
        int max = Integer.MIN_VALUE;

        String s = Integer.toBinaryString(n);
        //System.out.print(s);

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                for(int j = i+1; j<s.length(); j++){
                    if(s.charAt(j) == '1'){
                        int len = j-i;
                        max =  Math.max(len , max);
                        break;
                    }

                }
            }

        }
        if(max == Integer.MIN_VALUE){
            return 0;
        }
        return max;


        

    }
}