public class Pagesnumberingwithink {
    int solution(int current, int numberOfDigits) {
        while(numberOfDigits > 0){
            int digits = String.valueOf(current).length();
            if(numberOfDigits >= digits){
                numberOfDigits = numberOfDigits - digits;
                current++;
            }
            else{
                numberOfDigits = 0;
            }
        }
        return current-1;
        
        
    }
    
}
