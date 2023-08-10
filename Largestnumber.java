public class Largestnumber {
    int solution(int n) {
        //raise 10 to the power of int n and subtract 1 to get that largest number
        int solution = (int) Math.pow(10, n) - 1;
        return solution;
    }
    
}
