public class Differentrightmostbit {
int solution(int n, int m) {
    return Integer.lowestOneBit(n^m) ;
  }
}