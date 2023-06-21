public class Deletedigit {
    int solution(int number) {
        //store int for max number we can get
        int maxNumber = 0;
        //iterate starting from 1st digit
        for(int i = 1; i < number; i = i * 10) {
            //use math max to return absolute value
            //divide number by 10 to get rid of 1 digit. we multiply and get modulus for any other digits that persists
            maxNumber = Math.max(maxNumber,((number/i)/10) * i + number%i);
        }
        return maxNumber;
    
    }
    
}
