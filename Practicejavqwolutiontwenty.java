public class Practicejavqwolutiontwenty {
    public static void main(String[] args) {
        int objectSpeed = 42; // Example speed in km/s

        // Decide if an object is moving fast using a ternary operator
        String speedEvaluationMessage;
        if (objectSpeed >= 50) {
            speedEvaluationMessage = "Object is moving very fast!";
        } else {
            speedEvaluationMessage = "Object is moving slowly.";
        }
        //use ternanry operator by doing the condition first and the two actions after
        String speedEvaluation = objectSpeed >=50 ? "Object is moving very fast!" : "Object is moving very slowly.";
        System.out.println(speedEvaluationMessage);
    }
}
