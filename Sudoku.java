public class Sudoku {
    boolean solution(int[][] grid) {
        //check if row is unique
       for(int i = 0;i < 9;i++){
           int t = 1;
           for(int r: grid[i]) t *= r;
           if(t != 362880) return false;
       }
       //check if column is unique
       for(int j = 0;j < 9;j++){
           int t = 1;
           for(int i = 0;i < 9;i++) t *= grid[i][j];
           if(t != 362880) return false;
       }
       //check if grid is unique
        for(int i = 0; i < 9; i+=3){
           for(int j = 0; j < 9; j+=3){
               int t = 1;
               for(int m = i; m < i+3; m++)
                   for(int n = j; n < j+3; n++)
                       t *= grid[m][n];
               if(t != 362880) return false;
           }
       }
       return true;
   }
   
}
