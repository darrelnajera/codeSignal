public class Arraymaximaladjacentdifference {
    int solution(int[] inputArray) { 
        //store to see the biggest difference of adjacent integers
        int maxAdjacentDifference = 0; 
        
        //iterate through input array
        for (int i = 0; i < inputArray.length - 1; i++) { 
            //return absolute value difference between first integer and integer at next index
            int difference = Math.abs(inputArray[i] - inputArray[i - 1]); 
            //if any difference is bigger than the rest assign to max difference
            if(difference > maxAdjacentDifference) { 
                maxAdjacentDifference = difference; 
            } 
        } 
        //return
        return maxAdjacentDifference; 
    }
    
}
