public class Arraychange {
    int solution(int[] inputArray) {
        //number of moves to have strictly increasing sequence
        int moveCount = 0;
        int difference = 0;
        
        //iterate through array
        for(int i = 0; i < inputArray.length - 1; i++) {
            //if number at index i is greater than or equal to number at next index, assign their difference to int difference
            if(inputArray[i] >= inputArray[i + 1]) {
                difference = inputArray[i] - inputArray[i+1] +1;
                //assign new value to next index by simply adding the difference to the already existing integer at the next index
                inputArray[i+1] = inputArray[i+1] + difference;
                //add all moves(differences) to move count
                moveCount = moveCount + difference;
                
            }
        }
        //return
        return moveCount;
        
    
    }
    
}
