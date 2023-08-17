public class Willyou {
    boolean solution(boolean young, boolean beautiful, boolean loved) {
        if (!loved) {
            return (young && beautiful);
        } else {
            return !(young && beautiful);
        }
    }
    
}
