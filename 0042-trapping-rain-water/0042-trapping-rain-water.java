class Solution {
    public int trap(int[] height) {
        int hl= height.length-1;
        int[] pre = new int[hl+1];
        int[] suf = new int[hl+1];
         
        int temp1 =height[0];
        int temp2 =height[hl];
        for(int i=0;i<=hl;i++){
            temp1= Math.max(temp1, height[i]);
            pre[i]=temp1;
            temp2= Math.max(temp2, height[hl-i]);
            suf[hl-i]=temp2;
        }
        int ct=0;
        for(int i=0;i<=hl;i++){
            ct+=Math.min(pre[i], suf[i])-height[i];
        }
         return ct;
        
    }
}