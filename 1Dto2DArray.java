class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if( original.length != m*n){
            return new int[0][0];
        }
        int[][] matrix = new int[m][n];

        // for(int i=0; i<original.length; i++){
        //     matrix[i/n][i%n] = original[i];
        // }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=original[i*n+j];
            }
         }
        return matrix;
    }
}