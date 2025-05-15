class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fct= 0;
        int tct=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) fct++;
            else if (bills[i]==10){
                if(fct==0) return false;
                else{
                    tct++;
                    fct--;
                }
            }
             else{
               
                if(tct!=0 && fct!=0){
                    tct--;
                    fct--;
                }
                 else if(tct==0 && fct>=3){
                    fct-=3;
                }
                else {
                    return false;
                }
             }
        }
         return true;


        
    }
}