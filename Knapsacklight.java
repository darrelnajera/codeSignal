public class Knapsacklight {
    int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        //return 0 since both weights dont meet requirement
        if(weight2 > maxW && weight1 > maxW) {
            return 0;
        }
        // return the sum if less than maxW
        if(weight1 + weight2 <= maxW) {
            return value1+value2;
        //return only one value if one weight doesnt meet requirement
        }
        if(weight1 > maxW) {
            return value2;
        }
        if(weight2> maxW)
            return value1;
        
        
        //return value that is the biggest of the two if different.
        if (value1 < value2) return value2;
        return value1;
    
    }
    
    
}
