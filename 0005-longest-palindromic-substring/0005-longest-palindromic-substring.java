class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String maxstr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String odd=solver(s, i,i);
            String even = solver(s,i,i+1);
            if(odd.length()>maxstr.length()){
                maxstr= odd;
            }
            if(even.length() > maxstr.length()){
                maxstr= even;
            }
        }
        return maxstr;
    }
    String solver(String s, int a , int b){
        while(a>=0 && b<s.length() && s.charAt(a)==s.charAt(b)){
            a--;
            b++;
        }
        return s.substring(a+1,b);
    }
}