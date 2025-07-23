class Solution {
     int total=0;
    public int maximumGain(String s, int x, int y) {
        
        if(x>y){
            solver(s, 'a','b',x,y);
        }
        else{
            solver(s, 'b','a', y,x);
        }
         return total;
    }
    public void solver(String s, char a, char b, int x , int y){
        Stack<Character> st= new Stack<>();
        for( char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()==a && c==b){
                st.pop();
                total+=x;
            }
            else{
                st.push(c);
            }
        }
         StringBuilder remaining = new StringBuilder();
         while(!st.isEmpty()){
            remaining.append(st.pop());
         }
          remaining.reverse();
         st.clear();


         for( char c: remaining.toString().toCharArray()){
            if(!st.isEmpty() && st.peek()==b && c==a){
                total+=y;
                st.pop();
            }
             else {
                st.push(c);
             }
         }
    }
}