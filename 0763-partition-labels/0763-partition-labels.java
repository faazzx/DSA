class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,i);
        }
        List<Integer> arr= new ArrayList<>();
        int max=0;
        int prev=-1;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            max=Math.max(max, map.get(ch));
            if(max==i){
                arr.add(max-prev);
                prev= max;

            }

        }
         return arr;
    }
}