public class Magicalwell {
    int solution(int a, int b, int n) {
        int sum=0;
            while(n>0){
                sum += a*b;
                a++;
                b++;
                n--;
            }
          //  System.out.println(sum);
            return sum;
        }
         
}
