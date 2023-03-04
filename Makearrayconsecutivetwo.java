public class Makearrayconsecutivetwo {
    int solution(int[] statues) {
        int numberOfStatuesInArray = statues.length;
        Arrays.sort(statues);
        int shortest = statues[0];
        int tallest = statues[numberOfStatuesInArray - 1];
        return tallest - shortest - numberOfStatuesInArray + 1;
        }
        
        //1.First iterate how many statues there are by using .length
        //2.Sort in ascending order with .sort
        //3.[0] in the array is the first and shortest statue in ascending order, [-1] is the last and tallest
        //4. To get the number of missing statues, subtract the shortest from tallest.Then Subtract that number with the total number of statues and finally add "1" since the total number is included in the array.
        
        //
        
}
