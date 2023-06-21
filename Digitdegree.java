public class Digitdegree {
    int solution(int n) {
        //create counter number of turns it takes to get to single digit
        int turnCounter = 0;
        // while loop that ends once n is a single digit. increase counter by 1
        while (n >= 10) {
            int sum = 0;
            turnCounter++;
        //now we must calculate turns it takes for ALL numbers
            while(n > 0) {
                sum += n % 10; //determine the modulus of n
                n = n/10; //divide number by 10 to check if it is 1 digit
            } 
            //apply to n 
            n = sum;
        }
        //
    return turnCounter;
    }
    
}
