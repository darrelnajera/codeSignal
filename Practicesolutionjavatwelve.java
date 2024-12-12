public class Practicesolutionjavatwelve {
    class Solution {
        public static void main(String[] args) {
            //declare ints for total stars and stars discovered
            int starsCount = 7;
            int newStarsDiscovered = 2;
            //print out the sum get all the stars in the sky
            System.out.println("Total stars in the sky: " + (starsCount + newStarsDiscovered));
            //subtract ints to see how much are left after black hole
            System.out.println("Stars left after a black hole event: " + (starsCount - newStarsDiscovered));
            //multiply ints to see how much have been observed
            System.out.println("Stars observed through telescope enhancement: " + (starsCount * newStarsDiscovered));
            //divide ints to see how many are in constellation
            System.out.println("Result of dividing stars into constellations: " + (starsCount / newStarsDiscovered));
            //to check if there are an odd number of stars add both ints and check if it dividing by two does or does not have a remainder of 0.
            System.out.println("Are there odd number of stars? " + ((starsCount + newStarsDiscovered) % 2 != 0));
        }
    } 
}
