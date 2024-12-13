public class Practicejavasolutiontwentythree {
    class Solution {
        public static void main(String[] args) {
            int cloudCoveragePercentage = 30; // Amount of cloud cover expected
            
            if (cloudCoveragePercentage < 20) { // TODO: check if the coverage percentage is less than 20
                System.out.println("There are no clouds");
            } else if(cloudCoveragePercentage < 50) { 
                System.out.println("There are partly cloudy skies");
            } else {
                System.out.println("The skies are too cloudy");
            }
        }
}
