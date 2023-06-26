public class Chessknight {
    int solution(String box) {
        //return the x and y axis result using the method below 
        return findPossibleMoves(box.charAt(0), box.charAt(1));
        
    
    }
    //create an integer method that allows for us to increase the numnber of moves for all the possible l shaped moves that can happen without stepping out of bounds
    int findPossibleMoves(char across, char vertical) {
        int moves = 0;
        if(across - 2 >= 'a' && vertical - 1 >= '1') moves++;
        if(across - 2 >= 'a' && vertical + 1 <= '8') moves++;
        if(across - 1 >= 'a' && vertical - 2 >= '1') moves++;
        if(across - 1 >= 'a' && vertical + 2 <= '8') moves++;
        if(across + 2 <= 'h' && vertical + 1 <= '8') moves++;
        if(across + 1 <= 'h' && vertical +2 <= '8') moves++;
        if(across + 1 <= 'h' && vertical - 2 >= '1') moves++;
        if(across + 2 <= 'h' && vertical - 1 >= '1') moves++;
        return moves;
    }
    
    
}
