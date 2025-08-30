class Solution {
    public void nextPermutation(int[] nums) {
        
        // finding breakpoing ie first element that is bigger than its previous one 
        int size= nums.length-1;
        int bp=-1;
        for(int i=size-1 ;i>=0;i--){
            if(nums[i]<nums[i+1]){
                bp=i;
                break;
            }
        }

        // if there is no break point then reverse the whole array and return 
        if(bp==-1){
        int a=0;
        int b=size;
        while(a<b){
            int temp = nums[a];
            nums[a]= nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
        return;
        }


        // if we find the breaking point then 
        // find the first index from the right which is greater than the number at breaking point then swap it with breaking point 

        int smallest = bp;
        for(int i=size ; i>=0;i--){
            if(nums[i]>nums[bp]){
                smallest = i;
                 break;
            }
        }

        // now swapping starts 
         int temp = nums[smallest];
         nums[smallest]= nums[bp];
         nums[bp]= temp;
         int x=bp+1;
         int y=size;
         while(x<y){
            int tem = nums[x];
            nums[x]= nums[y];
            nums[y]= tem; 
            x++;
            y--;
         }
          return ;


    }
}