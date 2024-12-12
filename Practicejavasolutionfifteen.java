public class Practicejavasolutionfifteen {
    class Solution {
        public static void main(String[] args) {
            // TODO: Declare and initialize variables for fuel capacity (1500 gallons), consumption (120 gallons/hour), and flight duration (2 hours)
    
            // TODO: Calculate the remaining fuel after the flight
    
            // TODO: Use a logical operation to determine if the remaining fuel is more than half of the fuel capacity
    
            // TODO: Print out the result in a format: "Enough fuel for the next journey? true/false"
            
            //declare ints
            int fuelCapacity = 1500;
            int fuelConsumption = 120;
            int flightDuration = 2;
            
            //calculate rmaining fuel by subtracting consumption times duration from capacity
            int remainingFuel = fuelCapacity - (fuelConsumption * flightDuration);
            
            //declare boolean to see if there is enough fuel left(more than half);
            boolean enoughFuel = remainingFuel > (fuelCapacity / 2);
            
            //print out the result with correct spacing
            System.out.println("Enough fuel for the next journey? " + enoughFuel);
    
    
            
        }
    }
}
