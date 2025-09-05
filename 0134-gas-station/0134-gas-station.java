class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int costsum=0;
        int gassum=0;
        for(int  i=0;i<gas.length;i++){
            costsum+=cost[i];
            gassum+=gas[i];
        }
        if(costsum>gassum) return -1;
        int start=0;
        int cgas=0;
        
        for(int i=0;i<gas.length;i++){
            cgas+= gas[i]-cost[i];
            if(cgas<0){ 
                start=i+1;
            cgas=0;
            }
        }
        return start;
        
    }

}