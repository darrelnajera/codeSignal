public class Practicejavasolutionnineteen {
    class Solution {
        public static void main(String[] args) {
            int starTemperature = 5000; // Temperature in Kelvin
            String starType;
    
            // Determine star type based on temperature
            //if temp is more than 300 return red dwarf
            if (starTemperature > 3000) {
                starType = "Red Dwarf";
                //also if it is more than 3000 return brown dwarf
            } else if (starTemperature > 1000) {
                starType = "Brown Dwarf";
                //if neither return cold dark star with else statement
            } else {
                starType = "Cold, dark Star";
            }
            //print out which star it is after result
            System.out.println("The star is categorized as: " + starType);
        }
    }
}
