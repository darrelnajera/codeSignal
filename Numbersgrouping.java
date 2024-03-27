public class Numbersgrouping {
    int solution(int[] nums) {

        HashSet<Integer>set=new HashSet<Integer>();
    // Arrays.sort(nums);
     // int res=0, max=Integer.MIN_VALUE;    
        for (int i=0; i<nums.length; i++)        
        {                
            int num=nums[i]-1;    
            // if(num<=10000){
            //     set.add(0);
            // }
            // else{
                set.add(num/10000);
            // }
            
            // if(num>0 && num<=10000){
            //     set.add(1);
            // }
            // else if(num<=20000){
            //     set.add(2);
            // }
            // else if(num<=30000){
            //     set.add(3);
            // }
            // else if(num<=40000){
            //     set.add(4);
            // }
            // else{
            //     set.add(5);
            // }
        }    
        return nums.length+set.size();

}

}
