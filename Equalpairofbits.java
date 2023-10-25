public class Equalpairofbits {
    int solution(int n, int m) {
        return Integer.lowestOneBit(~(n^m));
      }
}
