class FindSumPairs {
    int[] n1;
    int[] n2;
    HashMap<Integer, Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
       
        n1= new int[nums1.length];
        n2= new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
           n2[i]=nums2[i];
           map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);

        }
        for(int i=0;i<nums1.length;i++){
           n1[i]=nums1[i];
        }
        
    }
    
    public void add(int index, int val) {
        int initial=n2[index];
        if(map.getOrDefault(n2[index],0)!=0){
            map.put(n2[index],map.getOrDefault(n2[index],0)-1);
        }
        map.put(initial+val, map.getOrDefault(initial+val,0)+1);
        n2[index]= initial+val;
    }
    
    public int count(int tot) {
        int ct=0;
        for(int i=0;i<n1.length;i++){
            int req= tot-n1[i];
            if(map.containsKey(req)){
                ct+=map.get(req);
            }
        }
         return ct;
       
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */