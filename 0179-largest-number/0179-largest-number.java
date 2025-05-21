class Solution {
    public String largestNumber(int[] nums) {
        String [] s= new String[nums.length];
        int sa= nums.length;
        for(int i=0;i<sa;i++){
            s[i]= String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)-> (b+a).compareTo(a+b));
        if(s[0].equals("0")) return "0";
        StringBuilder result= new StringBuilder();
        for(String ss: s){
            result.append(ss);
        }
        return result.toString();
    }
}