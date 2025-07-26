class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int fib(int n) {
         
         return solver(n);




        
    }


     public  int solver( int num){
        if(num==0) return 0;
        if(num==1) return 1;
        
        if(map.getOrDefault( num, 0)==0){
        int ans = solver(num-1) + solver(num-2);
        map.put(num,ans);
         return ans;
        }
        else return map.get(num);
     }
}