public class Addborder {
    String[] solution(String[] picture) {
        //create array of strings to make border
        //add 2 to the length to include 1 asterik on each side
        String[] border = new String[picture.length+2];
        //add 1 quotation mark to each side before and after asterik to complete border
        int quotations = picture[0].length();
        //column of quotations in index 0
        border[0]="";
        border[picture.length+1]="";
        //iterate through array border included
        for(int i=0;i<picture.length+2;i++){
            //add asteriks after quotations
            border[0] +="*";
            //add asterik before last quotations
            border[picture.length+1] +="*";
        }
        //
        for(int i=0;i<picture.length;i++){
            //finish border with asteriks above and below the characters
            border[i+1] = "*"+picture[i]+"*";
        }
        //return new border
        return border;
    }
    
    
    
}
