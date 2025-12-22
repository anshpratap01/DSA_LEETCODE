class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        

        // sabhi ko pahele heap m dalo
       

        for(int i = 0;i<stones.length; i++){
            max.add(stones[i]);

        }

        while(max.size()>1){
            int a = max.poll();
            int b = max.poll();
            if(a != b){
                int sub = Math.abs(a-b);
                max.add(sub);
            }


        }
        if(max.size() == 0){
            return 0;
        }
        return max.peek();


        
    }
}