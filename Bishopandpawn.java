public class Bishopandpawn {
    boolean solution(String bishop, String pawn) {
        //in order to be able to make the move, rate of x has to be the same as rate of y
        // character at 1 = x axis/ character at y axis = 0
        //
        if (Math.abs(pawn.charAt(1) - bishop.charAt(1)) == Math.abs(pawn.charAt(0) - bishop.charAt(0))) {
            //if there is no difference in rate, return true
            return true;
        } else {
            return false;
        }
            
    }
    
    
}
