public class Leastfactorial {
    int solution(int n) {
        int k=1;
        int i=1;
        while(k<n){
            k=i*k;
            i++;
        }
        return k;
    }
    
}
