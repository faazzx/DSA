class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hash.put( arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> hsh = new HashSet<>();
        for(int freq : hash.values()){
            if(!hsh.add(freq)){
                return false;
            }
        }
         return true;

        
    }
}