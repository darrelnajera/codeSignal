public class Rounders {
    
int solution(int n) {
    int p = 10;
    while (n > p) {
      if ((n % p) / (p / 10) < 5)
        n = (n / p) * p;
      else
        n =  (n/p+1)*p ;
      p *= 10;
    }
    return n;
  }
  
}
