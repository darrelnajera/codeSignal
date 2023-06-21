public class Circleofnumbers {
    int solution(int n, int firstNumber) {
        //numbers have to be from 0 to n-1(last number)
        //in the example in order to return 7, we would have to divide n by 2 and get the modulus of n
        return(firstNumber + n / 2) % n;
        
        }
        
}
