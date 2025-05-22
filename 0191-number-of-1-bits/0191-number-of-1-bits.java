class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int size= s.length();
         int ct=0;
        for(int i=0; i<size;i++){
            if(s.charAt(i)=='1') ct++;
        }
         return ct;
    }
       
        
    }
    