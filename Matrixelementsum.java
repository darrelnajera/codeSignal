public class Matrixelementsum {
    int solution(int[][] matrix) {
        int totalCost = 0;
        for(int i = 0; i<matrix[0].length; i++){
        for(int j = 0; j<matrix.length; j++){
        totalCost += matrix[j][i];
        if(matrix[j][i] == 0)
        break;
        }
        }
        return totalCost;
        }
        
}
