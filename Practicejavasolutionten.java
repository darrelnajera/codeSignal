public class Practicejavasolutionten {
    class Solution {
        public static void main(String[] args) {
            int starLightSpeed = 299792; // Speed of light from a star in km/s
            int spacecraftSpeed = 40000; // Speed of spacecraft in km/s
    
            // TODO: Determine if our spacecraft can travel faster than starlight and print the result
            //create boolean to see if it can outrun
            boolean canOutrun = starLightSpeed < spacecraftSpeed;
            //add boolean to end of statement
            System.out.println("Can our spacecraft outrun starlight? " + canOutrun /* TODO: Add the missing logic here */);
        }
    }
}
