public class Extranumber {
    int solution(int a, int b, int c) {
        //reutrn third number if a and b are the same
        if(a == b && b == a){
            return c;
            //return b if a and c are equal
        } else if(a == c && c == a ){
            return b;
        }
        //else return a
        else{
            return a;
        }
        
    }
    
}
