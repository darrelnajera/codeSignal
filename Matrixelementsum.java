public class Matrixelementsum {
    int solution(int[][] matrix) {
        //Store integer for cost of all the rooms
        int totalCost = 0;
        //1st for loop iterates through the top row([0]) since this is the row respnsible for the rooms that will be able to be used
        //2nd for loop keeps track through all of the columns.
        for(int row = 0; row<matrix[0].length; row++){
        for(int column = 0; column < matrix.length; column++){
        //The total cost equals all the potentially inhabitable rooms through the whole 2d array
        totalCost += matrix[row][column];
        //If any of the rooms multiplied by eachother when adjacent, below or above another, break because theyre product will equal 0.
        if(matrix[row][column] == 0)
        break;
        }
        }
        return totalCost;
        }
        
}
