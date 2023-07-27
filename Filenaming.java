public class Filenaming{
String[] solution(String[] names) {
    ArrayList<String> list = new ArrayList<>();
    //iterate through elements in arraylist
    for(int i = 0; i < names.length; i++){
        //integer after the name if file is duplicate
        int version = 1;
        ///if the list doesnt already contain name at index i add it to arraylist
        if(!list.contains(names[i])){
            list.add(names[i]);
        }
        //if the name already exists, add the int version with parenthesis around it
        else{
            while(list.contains(names[i] + "(" + version + ")")){
                //for every duplicate file, increase int version by 1
                version++;
            }
            //add the altered file to arraylist
            list.add(names[i] + "(" + version + ")");
        }
    }
    //print out arraylist
    System.out.println(list);
}
}