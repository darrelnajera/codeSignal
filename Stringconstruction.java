public class Stringconstruction {
    int solution(String a, String b) {

        ArrayList list = new ArrayList();
        int ans = 0;
        
        
        for(int i = 0; i < b.length(); i++){
            list.add(b.substring(i,i+1));
        }
        
        
        while(list.contains(a.substring(0,1))){
        for(int j = 0; j < a.length(); j++){
            if(!list.remove(a.substring(j,j+1))){
                break;
            }
            if(j == a.length()-1){
                ans++;
            }
        }
            }
            
        return ans;
    }
    
    
}
