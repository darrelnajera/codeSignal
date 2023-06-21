public class Boxblur {
    int[][] solution(int[][] image) {
        //columns
        int y = image[0].length - 2;
        //rows
        int x = image.length - 2;
        //create 3d array with rows and columns as the size limit/parameter
        int[][] array = new int[x][y];
        //store for when we add all the integers together
        int sumOfAll = 0;
        //double for loop to iterate through rows and columns
        for(int i=1; i<=x; i++) {
          for(int j=1; j<=y; j++){
            //add up all the integers via indices position in the 3d array
            sumOfAll = image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1]+
            image[i][j - 1] + image[i][j] + image[i][j + 1]+
            image[i + 1][j - 1] + image[i + 1][j] + image[i + 1][j + 1];
            //divide the sum by 9 since there are 9 integers and assign to array
            array[i-1][j-1] = sumOfAll/9;
          }
      }
      //return
      return array;
    }
}
