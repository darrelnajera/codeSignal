public class Practicjavasolutiontwentyfive {
    class Solution {
        public static void main(String[] args) {
            // Using + operator to concatenate parts of a greeting message
            String greeting = "Hello, " + "Java " + "programmer!";
            System.out.println(greeting);
    
            // Using StringBuilder to concatenate parts of a greeting message
            StringBuilder greetingSb = new StringBuilder();
            //Use append method to concatenate
            greetingSb.append("Hello, ").append("Java ").append("programmer!");

            //Use toString to convert our appended greeting to a string
            System.out.println(greetingSb.toString());
        }
    }
}
