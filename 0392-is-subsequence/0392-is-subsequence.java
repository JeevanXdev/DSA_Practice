class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int j=0;
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        while(i<s.length() && j<t.length()){
            if(ch[i] == ch2[j]){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}