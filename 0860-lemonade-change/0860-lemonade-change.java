class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int tty=0;
        int size= bills.length;
        for(int i=0;i<size;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(ten==0 && five>=3){
                    five-=3;
                }
                else {
                    return false;
                }
            }
        }
         return true;
    }
}