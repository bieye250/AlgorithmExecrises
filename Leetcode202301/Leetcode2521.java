package Leetcode202301;

public class Leetcode2521 {
    public int distinctPrimeFactors(int[] nums) {
        var set = new HashSet<Integer>();
        for(int i : nums){
            if(i <= 3) set.add(i);
            else{
                var t = (int)Math.sqrt(i);
                for(int j=2; j<=t; j++){
                    if(i % j == 0){
                        set.add(j);
                        while(i % j == 0) i /= j;
                        if(i == 1) break;
                    }
                }
                if(i > 1) set.add(i);
                System.out.println(i);
            }
        }
        return set.size();
    }    
}
