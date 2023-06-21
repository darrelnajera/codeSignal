public class Evendigitsonly {
    boolean solution(int n) {
        //if number has no remainder, return true
        if(n == 0) {
            return true;
        }  
        //else number is not even
        if(n %2 != 0) {
            return false;
        }
       
            
            
        //return solution modulus of 10 
        return solution(n/10);
    
    }
    
    
}
