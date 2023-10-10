public class Leetcode2895 {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, (i, j)-> i-j>0?-1:1);

        int ans = 0, p = 0;
        for(int i : processorTime){
            ans = Math.max(ans, i+tasks.get(p));
            p += 4;
        }

        return ans;
    }
}
