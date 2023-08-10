public class Seatsintheatre {
    int solution(int nCols, int nRows, int col, int row) {
        //subtract the rows and columns that we are blocking the view from the whole number of rows and columns in theatre. Add our seat too(1).
        return(nRows- row)*(nCols - col + 1);
        }
        
}
