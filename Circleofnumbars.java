public class Circleofnumbars {
    int solution(int n, int firstNumber) {
        //in order to get number, we have to add first number plus given dived by 2, and modulus of n
        return (firstNumber + n / 2) % n;
    }
    
}
