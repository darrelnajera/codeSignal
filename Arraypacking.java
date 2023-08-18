public class Arraypacking {
    int solution(int[] a) 
{
    int result = 0;
   
    if((a.length >= 1) & (a.length <= 4)) 
    {
        for(int index=0; index < a.length; index++) 
        {
            result += a[index] << 8 * index;
        }
    }
    return result;
}


}
