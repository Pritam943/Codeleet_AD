class Solution {
    public void duplicateZeros(int[] arr) {

     int p1 = 0;

      while(p1 < arr.length-1){

             if(arr[p1] == 0){
               
               for(int i=arr.length-2; i>p1; i--){
                   arr[i+1] = arr[i];
               }
               arr[p1+1] = 0;
               p1++; 
             }
             p1++;
      }
    }
}