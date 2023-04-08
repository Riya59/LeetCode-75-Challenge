class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        int arr[] = new int[128];
        for(char c: s.toCharArray()){
            arr[c]++;
        }
        for(int i:arr){
            result = result + i/2 * 2;
            if(result % 2 == 0 && i%2 != 0){
                result++;
            }
        }
        return result;
    }
}
