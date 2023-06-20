public class Areequallystrong {
    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        //use integer max to see if there is a bigger number in each scenerio
        //compare your stronges to friends strongest in the form of a boolean
        boolean strongest = Integer.max(yourLeft,yourRight) == Integer.max(friendsLeft,friendsRight);
        //compare weakest
        boolean weakest = Integer.min(yourLeft, yourRight) == Integer.min(friendsLeft, friendsRight);
        //return boolean
        return strongest && weakest;
   
   }
   
    
}
