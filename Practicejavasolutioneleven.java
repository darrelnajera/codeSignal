public class Practicejavasolutioneleven {
    class Solution {
        public static void main(String[] args) {
            // TODO: Assign the distance to the Moon (384400 kilometers) to a variable
            // TODO: Assign the distance to Mars (225000000 kilometers) to another variable
            
            // TODO: Compare the distance to the Moon to see if it's less than 1 million kilometers
            // TODO: Check if the distance to Mars is greater than the distance to the Moon
            
            // TODO: Print results of these two comparisons to the console
            //declare int variables
            int distanceToMoon = 384400;
            int distanceToMars = 225000000;
            //declare booleans to add to our print lines
            boolean canReachTheMoon = distanceToMoon < 1000000;
            boolean isMarsFarther = distanceToMoon < distanceToMars;
            //print results
            System.out.println("Can our spacecraft reach the moon?" + canReachTheMoon);
            System.out.println("Is mars farther than the moon?" + isMarsFarther);
        }
    }
}
