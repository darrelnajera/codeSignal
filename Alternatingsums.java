public class Alternatingsums {
    int[] solution(int[] a) {
        // store ints for first and second team
        int firstTeam = 0; int secondTeam = 0;
        //itereate through array a
        for (int i = 0; i < a.length; i++) {
            //if the integer at chosen index is divisible by two, add to team 1 and add all numbers together
            if(i % 2 ==0) {
                firstTeam += a[i];
                //else off to team two
            } else {
                secondTeam += a[i];
            }
            
        }
        //return a new two number integer that has the sums of both teams inside curly braces
        int [] sums = {firstTeam, secondTeam};
        //return the curly braced array
        return sums;
    
    }
    
    
}
