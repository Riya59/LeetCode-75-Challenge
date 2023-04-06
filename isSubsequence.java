class Solution {
    public boolean isSubsequence(String s, String t) {
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        int i=0,j=0;
        if(s.length()< 1){
            return true;
        }
        while(i<t.length()){
            if(s1[j] == s2[i]){
                j++;
            }
            i++;
            if(j == s.length()){
                return true;
            }
        }
        return false;
        
    }
}
