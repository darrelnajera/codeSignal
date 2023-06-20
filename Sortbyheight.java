public class Sortbyheight {
    int[] solution(int[] a) {
        //create an arraylis of integers
          ArrayList<Integer> list = new ArrayList<Integer>();
            
            //for each loop to iterate through each integer
            for (int i : a) {
                //for each number that is not negative 1, add them to arraylist to sort them
                if (i != -1) {
                    list.add(i);
                }
            }
            //sort list in a non ascending way
            Collections.sort(list);
            
            //index for added integers
            int index = 0;
            //for loop iterates through the length of a
            for (int i = 0; i < a.length; i++) {
                //if number is not -1 at selected index// add to index and get the whole list
                if (a[i] != -1) {
                    a[i] = list.get(index++);
                }
            }
            //after everything has been added to array a, return a
        
            return a;
        }
        
        
}
