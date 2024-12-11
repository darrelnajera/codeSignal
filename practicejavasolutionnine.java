public class practicejavasolutionnine {
    class Solution {
        public static void main(String[] args) {
            // Scenario: Determining if a spacecraft is in safe velocity range for landing
            int safeLandingMaxSpeed = 1000; // maximum safe landing speed in km/h
            int spacecraftSpeed = 1200; // current spacecraft speed in km/h
    
            // TODO: Create a new boolean variable "isTooFastForLanding" and update the print statement accordingly
            boolean canLandSafely = spacecraftSpeed <= safeLandingMaxSpeed;
            //create boolean for the scenario if the speed is too fast to match the int
            boolean isTooFastForLanding = spacecraftSpeed > safeLandingMaxSpeed;
            //change statement to match boolean istoofast
            System.out.println("Is the spacecraft moving too fast for a safe landing?" + isTooFastForLanding);
            // If spacecraftSpeed is 1200, it will print: Can the spacecraft land safely? false
        }
    }
}
