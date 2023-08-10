public class Spiralnumbers {
    int[][] solution(int n) {
    
        int[][] matrix = new int[n][n];
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;
        //iterate through the whole array. The array will consist its size of the number 1 to given n times n.
        for(int num=1; num<=n*n;) {
            //add integers from top row from left to right to int top
            for(int j=left; j<=right; j++) {
                matrix[top][j] = num++;
            }
            top++;
            //excluding top row, add numbers on right column from top to bottom
            for(int i=top; i<=bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            for(int j=right; j>=left; j--) {
                matrix[bottom][j] = num++;
            }
            bottom--;
            for(int i=bottom; i>=top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
    
}
