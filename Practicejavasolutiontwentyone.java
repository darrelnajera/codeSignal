public class Practicejavasolutiontwentyone {
    class Solution {
        public static void main(String[] args) {
            int starBrightness = 2; // Brightness of the observed star on a scale from 1 to 10
            
            // Let's use a switch statement to decide what to do based on star brightness
            switch(starBrightness) {
                case 1:
                    System.out.println("Star is too dim, use a bigger telescope.");
                    break;
                case 2:
                    System.out.println("Star could be more visible, try to adjust the lens.");
                    //fix bug by adding the missing break statement because our switch statement is running more than one casee at a time. thats not good.
                    break;
                case 3:
                    System.out.println("Star is fairly bright, let's start the analysis.");
                    break;
                default:
                    System.out.println("This star is so bright, it's visible to the naked eye!");
            }
        }
    }
}
