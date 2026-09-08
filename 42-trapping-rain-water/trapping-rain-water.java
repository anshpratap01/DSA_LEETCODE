class Solution {

    public int[] getleftmax(int height[], int n){
    int left[] = new int[n];
    int maxleft = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++){
        maxleft = Math.max(maxleft, height[i]);
        left[i] = maxleft;
    }
    return left;
}

public int[] getrightmax(int height[], int n){
    int right[] = new int[n];
    int maxright = Integer.MIN_VALUE;
    for(int i = n-1; i >= 0; i--){
        maxright = Math.max(maxright, height[i]);
        right[i] = maxright;
    }
    return right;
}
    
    public int trap(int[] height) {
        int n = height.length;

        if(n == 1 || n== 0){
            return 0;
        }

        int leftmax[] = getleftmax(height, n);
        int rightmax[] = getrightmax(height, n);
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += Math.min(leftmax[i] , rightmax[i]) - height[i];
            
        }
        return sum;





        
    }
}