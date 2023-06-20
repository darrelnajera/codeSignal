public class Islucky {

        boolean solution(int n) {
            // assign ticket number to the string
            String ticket = n+"";
            //store ints for sum and the length of string n
            int sum = 0;
            int size = ticket.length();
            //for loop iterates through two halves of string
            for(int i = 0; i < size / 2; i++) {
                //characters at left half
                int leftSide = (int) ticket.charAt(i);
                // characters at right side
                int rightSide = (int) ticket.charAt(size - i - 1);
                //assign the subtraction of characters on each side to sum
                sum = sum + leftSide - rightSide;
                
            }
            //if sum = 0, boolean is true
            return sum == 0;
        
        }
        
    }
    

