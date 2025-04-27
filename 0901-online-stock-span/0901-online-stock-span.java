class StockSpanner {
   ArrayList<Integer> arr= new ArrayList<>();
    public StockSpanner() {}
         
    
    public int next(int price) {
       // if(arr.size()==6) arr.remove(0);
        arr.add(price);
        int ct=1;
        for(int i=arr.size()-2;i>=0;i--){
            if(arr.get(i)<=price) ct++;
            else{return ct;}
        }
         return ct;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */