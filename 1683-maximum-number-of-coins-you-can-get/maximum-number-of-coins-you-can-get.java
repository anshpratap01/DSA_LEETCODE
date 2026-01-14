class Solution {
    public int maxCoins(int[] piles) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<piles.length; i++){
            ans.add(piles[i]);
        }

        Collections.sort(ans, Collections.reverseOrder());
        // for(int i = 0; i<ans.size(); i++){
        //     System.out.print(ans.get(i) + " ");
        // }
       
        int sum = 0;
        while(ans.size()>=3){
        //int n = ans.size();
        int a = ans.get(0);
        int b = ans.get(1);
        int c = ans.get(ans.size()-1);
        sum += b;
        ans.remove(0);
        ans.remove(1);
        ans.remove(ans.size()-1);
       
        // for(int i = 0; i<ans.size(); i++){
        //     System.out.print(ans.get(i) + " ");
        // }


        }
        return sum;



        
    }
}