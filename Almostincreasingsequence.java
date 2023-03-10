boolean solution(int[] sequence) {
   
    //Store the amount of times there is an error in the array and store the boolean result for later
    int timesFailed = 0;
    boolean result;  
        
        //Use the for loop to iterate through the whole sequence length(length-1 being the last number in the array)//  
        for(int i = 0; i < sequence.length - 1; i++){
           
            //Store the number we will be comparing as "current" and "next" as the number to the right(+1)//
            int current=i,next=i+1;
           
            //The timesFailed value we stored earlier will automatically increase the current number is bigger than the next//
            if(sequence[current] >= sequence[next]) {                
                timesFailed++;                                    
                    // As long as the current number, or number before(current - 1) is less than any number after the current, the result will be true.Anything else will be false
                    if( current > 0 && next < sequence.length - 1 ){
                      
                        result = false;
                        if( sequence[current - 1] < sequence[next] )
                            result = true ;                         
                        if ( sequence[current] < sequence[next+1] )
                            result = true ;
                        if( result == false ) return false;
                    }

            }
            //If the amount of times their is a failure in the sequence is more than 1, return false. Return true in any other case OUTSIDE for loop.//
            if( timesFailed > 1 ) return false;            
        }
    return true;        
}
    