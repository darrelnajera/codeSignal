public class Arraymaxcconsecutivesum {
    int solution(int[] inputArray, int k) {

        //store the max value to be found and int for current sum 
        int max = 0;
        int consecutiveSum = 0;
        //itereate through inputarray to find sum of each two numbers
        for(int i = 0; i < inputArray.length; i++){
            //if the difference is more than 0 -> sum not big enough so we have to delete uneccessary sums
            if((i - k) >= 0) consecutiveSum = consecutiveSum - inputArray[i-k];
            //else, add the sums that are necessary
                consecutiveSum = consecutiveSum + inputArray[i]; 
            //if one of the sums is larger than the rest apply that sum to int max
            if(consecutiveSum > max) 
                max = consecutiveSum;
            
            
        }
        return max;
        }
    
}
