class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s1 = new char[256];
        char[] t1 = new char[256];
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(s1[schar] == 0 && t1[tchar] == 0){
                s1[schar] = tchar;
                t1[tchar] = schar;

            }
            else if(s1[schar] != tchar){
                return false;
            }
        }
        return true;
    }
   
}
