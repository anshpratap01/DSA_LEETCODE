class Solution {
    public boolean isAnagram(String s, String t) {
        char arr[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);
       boolean eql = Arrays.equals(arr ,arr2);
        return eql;
        
    }
}