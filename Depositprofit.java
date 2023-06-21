public class Depositprofit {
    int solution(int deposit, int rate, int threshold) {
        //the deposit and threshold are decimals so they have to be doubles
        int year = 0;
        double newDeposit = deposit;
        //while loop to continue until threshold is hit
        while(threshold > newDeposit) {
            //everytime rate is calculated, year goes up
            newDeposit += newDeposit * rate / 100;
            year++;
        }
        return year;
        }
        
}
