public class Practicejavasolutionthirteen {
    class Solution {
        public static void main(String[] args) {
            // Constants representing the level of fuel in the spaceship and the required minimum before launch.
            int currentFuel = 300;
            int requiredFuel = 300;
            boolean engineCheckComplete = true;
    
            // Check if there is adequate fuel and if the pre-launch engine check is complete.
            
            //Error is that it has to be == to required fuel not more than it for engineCheckComplete to be true. Also debug logical operator to && operator to make sure both conditions are met
            System.out.println(currentFuel == requiredFuel && engineCheckComplete);
        }
    }
}
