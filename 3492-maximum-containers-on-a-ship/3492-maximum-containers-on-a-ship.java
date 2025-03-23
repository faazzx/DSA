class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ts= n*n;
        while(ts*w>maxWeight){
               ts--;
        }
        return ts;
    }
}