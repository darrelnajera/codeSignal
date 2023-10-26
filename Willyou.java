public class Willyou {
    boolean solution(boolean young, boolean beautiful, boolean loved) {
        //if boolean doesnt equal loved return other two
        if (!loved) {
            return (young && beautiful);
            //else dont return other two
        } else {
            return !(young && beautiful);
        }
    }
    
}
