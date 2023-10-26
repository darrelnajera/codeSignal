public class Additionwithoutcarrying {
    
int solution(int param1, int param2) {
    int a=0,b=0,c=0;
    int i=1;
    while(param1>0 || param2>0 ){
        a=param1%10;
        b=param2%10;
        c+=((a+b)%10)*i;
        param1/=10;param2/=10;i*=10;
    }
    System.out.println(c);
    return c;
}
}
