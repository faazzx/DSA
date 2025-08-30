class Solution {
    public void nextPermutation(int[] nums) {
        int bp=-1;
        //finding breaking point
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                bp=i;
                break;
            }
        }
        if(bp==-1){
            int a=0;
            int b=nums.length-1;
            while(a<b){
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;
            }
            return;
        }
        //finding index in the array
        int smallest=nums[bp];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[bp]){
                smallest=i;
                break;
            }
        }
        //swapping
        int temp=nums[smallest];
        nums[smallest]= nums[bp];
        nums[bp]=temp;
        int x=bp+1;
        int y=nums.length-1;
        while(x<y){
            int tep=nums[x];
            nums[x]=nums[y];
            nums[y]=tep;
            x++;
            y--;
        }
    }
}