class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        char res='{';
        for(int i=0;i<n;i++){
            if(res>letters[i] && letters[i]>target){
                res=letters[i];
            }
        }
        if(res=='{'){
            return letters[0];
        }
        return res;
        
    }
}