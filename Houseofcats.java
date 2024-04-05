public class Houseofcats {
    int[] solution(int legs) {
        int[] returnArray;
        int i;
        int arraySize = 0;
        int[] fullArray = new int[legs/2 + 1];
        for (i = 0; i <= legs/2; i++)
        {
            if ((legs - 2*i)%4 == 0)
            {
                fullArray[arraySize] = i;
                arraySize++;
            }
        }
        returnArray = new int[arraySize];
        for (i = 0; i < arraySize; i++)
        {
            returnArray[i] = fullArray[i];
        }
        return returnArray;
    }
    
}
