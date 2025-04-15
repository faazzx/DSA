class Solution {
    public boolean isPalindrome(int x) {
        int k=x;
        if(x<0)return false;
        int ans=0;
        while(k>0)
        {
            ans=ans*10+k%10;
            k=k/10;
        }
        if (ans==x)return true;
        return false;
    }
}