public class Increasenumberroundness {
    boolean solution(int n) {
        boolean round = false;
        while (n>0){
           if(n%10 == 0 && round){
            return true;
         }
           else if(n%10 != 0){
              round = true;
           }
           n/=10;
        }  
        return false;
     }
     
}
