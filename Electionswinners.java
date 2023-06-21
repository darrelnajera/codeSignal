public class Electionswinners {
    int solution(int[] votes, int k) {
        //store integers to see who has the most votes and who can still win
        int winner = 0; 
        int canStillWin  = 0;
        //iterate through all candidates in array
        //if a candidate has the highest number of votes assign them to int winner
        for(int i = 0; i < votes.length; i++){
            if(i > winner)
                winner = i;
        }
        //store int to find number of winners if more than 1
        int numberOfWinners = 0;
        //iterate through candidates again
        for(int i = 0; i < votes.length; i++){
            //for every winner, increase number of winners by 1
            if(winner == i)
                numberOfWinners++;
                //if the amount of voters left + any of the candidates amount of votes is greater than the winner, they can still win
            if(k + i > winner){
                canStillWin++;
            }
        }
        //return only 1 person can win if everyone else is eliminated
        if(numberOfWinners == 1 && canStillWin == 0)
            return 1;
            //result
        return canStillWin;
    }
    
}
