public class Practivejavasolutionfourteen {
    class Solution {
        public static void main(String[] args) {
            int starsCounted = 17;
            int galaxiesCounted = 3;
            boolean darkMatterFound = false;
    
            // TODO: Calculate how many cosmic bodies we've found in total.
            
            //add both ints together and assign to total bodies
            int totalBodies = (starsCounted + galaxiesCounted);
            System.out.println("Total cosmic bodies counted: " + totalBodies);
    
            // TODO: Use a logical AND operation to check:
            
            //use correct spacing and use more than operator to see if stars are more than 15 and return dark matter found to see findings and add stars and galaxies together to return total bodies
            System.out.println("Found more than 15 stars and the dark matter: " + (starsCounted > 15 && darkMatterFound));
        }
    }
}
