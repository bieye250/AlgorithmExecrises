public class Leetcode2261 {
    public int countDistinct(int[] nums, int k, int p) {
        var set = new HashSet<Long>();
        int mod = 1_000_000_000+7, pow1 = 233, pow2 = 2333, len=nums.length;
        for(int i=0; i<len;i++){
            for(int j=i,hash1=0,hash2=0,cnt=0;j<len;j++){
                 if(nums[j]%p == 0) cnt++;
                 if(cnt > k) break;
                 hash1 = (int)(1L*hash1*pow1+nums[j])%mod;
                 hash2 = (int)(1L*hash2*pow2+nums[j])%mod;
                 set.add((long)hash1<<32|hash2);
            }
        }
        return set.size();
    }
}
