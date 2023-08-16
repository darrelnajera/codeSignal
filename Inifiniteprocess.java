public class Inifiniteprocess {
    boolean solution(int a, int b) {
        //if numbers are same return false
        if (a == b)
            return false;
            //if a is more than be its true
        if (a > b)
            return true;
            //if b minus a is less than 2, also true
        else if (b - a < 2)
            return true;
            //if difference of a from b modulus of 2 = 1, return true
        else if ((b - a) % 2 == 1)
            return true;
            //else false
        else
            return false;
    }
    
}
