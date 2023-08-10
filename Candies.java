public class Candies {
    int solution(int kids, int pieces) {
        //subtract m modulus of n from m to get number of candies altogether
        return pieces - pieces % kids;
    }
    
    
}
