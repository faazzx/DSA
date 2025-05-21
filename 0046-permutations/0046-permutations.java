class Solution {
    List<List<Integer>> arr= new ArrayList<>();
    List<Integer> ar= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solver(nums,0,ar);
        return arr;
    }
    public void solver(int[] nums, int a, List<Integer> ar){
            if(a==nums.length){
                arr.add(ar);
                return ;
            }
            for(int i=0;i<=ar.size();i++){
                List<Integer> ar1= new ArrayList<>(ar);
                 ar1.add(i,nums[a]);
                 solver(nums,a+1,ar1);
            }
            
    }
}