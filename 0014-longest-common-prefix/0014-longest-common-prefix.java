class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String s="";
        while(i<strs[0].length() ){
            if(i>strs[strs.length-1].length()){
                return s;
            }
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return s;
            }
            else{
                s=s+Character.toString(strs[0].charAt(i));
                i++;
            }
        }
        return s;
    }
}