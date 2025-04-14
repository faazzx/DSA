class Solution {
    public int reverse(int x) {
        boolean  a = true ;
        
        if(x<0)
        {
            x=0-x;
            a=false;
        }
        long ans=0;
        while(x>0)
        {
            int temp=x%10;
            x=x/10;
            ans=ans*10+temp;
        }
        if(ans>Integer.MAX_VALUE)
        {
            return 0;
        }
        if(a==true)
        {
            return (int)ans;
        }
        return (int)ans*-1;
        
        
    }
}