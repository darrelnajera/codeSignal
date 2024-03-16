public class Comfortablenumbers {
    int solution(int l, int r) {
        int noComf = 0;
        for (int i=l; i<r; i++){
            for (int j=i+1; j<=r; j++){
                if ((i+digitSum(i))>=j && (j-digitSum(j))<=i) noComf++;
            }
        }
        return noComf;
    }
    
    
    int digitSum(int a){
        int sum =0;
        while (a>0){
            sum+=a%10;
            a /= 10;
        }
        return sum;
    }
}
