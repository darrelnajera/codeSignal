public class Growingplant {
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        //store int for the height and days
    int height = 0;
    int days = 0;
    
    //while loop that goes on until desired heigh is reached
    while(height < desiredHeight) {
        //height increases by int upspeed
        //everytime height increases, days increase by 1
        height = height + upSpeed;
        days++;
        //stop loop once height is reached 
        //subtract from height everytime downspeed occurs
        if(height >= desiredHeight) break;
        height = height - downSpeed;
    }
    //return 
    return days;
    }
    
    
}
