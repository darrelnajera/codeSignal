public class Practivejavasolutiontwentynine {
    class Solution {
        public static void main(String[] args) {
            String spaceExplorer = "Cosmo";
            int discoveredPlanets = 7;
            
            //use + operator to add string and int and other phrases concatenated together
            String report1 = spaceExplorer + " discovered " + discoveredPlanets + " new planets!"; 
            
            //we will concatenate this string with report 1
            String excitement = " This is amazing!";
            
            //concatenate  using concat
            String report2 = report1.concat(excitement);
            
            //orintout report 2
            System.out.println(report2);
        }
    }
}
