public class Shapearea {
    int solution(int n) {
        return (int) (Math.pow(n-1, 2) + Math.pow(n, 2));
        }
        //Step 1:Declare Int variable to make sure we are not working with doubles since these polygons are not involved with decimals.
        //Step 2:To return n, which is the area of the polygon, we have to use the math library to add n minus 1 squared, and n squared to get the total area of the poygon.
}
