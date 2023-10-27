public class Candles {
   
int solution(int solutionNumber, int makeNew) {
    int burned = 0, leftover = 0;
    while(solutionNumber > 0){
        solutionNumber--;
        leftover++;
        burned++;
        if(leftover == makeNew){
            solutionNumber++;
            leftover = 0;
        }
    }
    return burned;
}

}
