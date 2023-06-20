public class Avoidobstacles {
    int solution(int[] inputArray) {
    
        //assign 2 to this value since it is the constraint of array.length
        int jump = 2;
        
        //if one of values in arraylength divided by the constraint = 0, increase jump distance by 1
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] % jump == 0){
                //set i to -1 to start from beginning of array since condition increments by 1
                i = -1;
                jump++;
            }
            
            
        }
        return jump;
        
    
    }
    
    
}
