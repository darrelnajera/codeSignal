public class Tennisset {
    boolean solution(int score1, int score2) {
        if(score1 >= 5 && score2 >= 5) {
            if((score1 == 7 || score2 == 7) && !(score1 == 7 && score2 == 7)) {
                return true;
            }
        }
        else if(score1 == 6 && score2 < 6) {
            return true;
        }
        else if(score2 == 6 && score1 < 6) {
            return true;
        }
        
        return false;
    }
    
    
