public class Practicjavasolutiontwentyfive {
    class Solution {
        public static void main(String[] args) {
            // Using + operator to concatenate parts of a greeting message
            String greeting = "Hello, " + "Java " + "programmer!";
            System.out.println(greeting);
    
            // Using StringBuilder to concatenate parts of a greeting message
            StringBuilder greetingSb = new StringBuilder();
            greetingSb.append("Hello, ").append("Java ").append("programmer!");
            
            System.out.println(greetingSb.toString());
        }
    }
}
