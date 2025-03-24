class Solution {
    public int countDays(int days, int[][] m) {
         // merge intervals first
         List<int[]> arr= new ArrayList<>();
         Arrays.sort(m, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
         int [] a = new int [2];
         a[0]=m[0][0];
         a[1]=m[0][1];
         
         for(int i=1;i<m.length;i++){
            if(m[i][0]>a[1]){
                
                arr.add(a);
                a=m[i];
            }
            else{
                a[1]=Math.max(a[1], m[i][1]);
            }
         }
         arr.add(a);
         int free=0;
         for(int i=0;i<arr.size();i++){
            free+=arr.get(i)[1]-arr.get(i)[0]+1;
         }
          return days-free;

    }
}