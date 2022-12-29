package Leetcode202211;

public class Leetcode2453 {
    public int destroyTargets(int[] nums, int space) {
        Map<Integer,Integer> lenMap = new HashMap<Integer,Integer>();
        Map<Integer,Integer> minMap = new HashMap<Integer,Integer>();
        int maxM = 0, maxF = 0;
        for(int i : nums){// 按照对space取模的结果分组,并计算分组的长度和最小值
            int x = i % space;
            if(!lenMap.containsKey(x)){// 初始化
                lenMap.put(x,1);// 代表x可以打击的目标是1个
                minMap.put(x,i);
            }else{// 更新x对应的组长度和最小值
                lenMap.put(x,lenMap.get(x)+1);//累加x组的成员个数
                minMap.put(x,Math.min(minMap.get(x),i));// 打擂获得该组的最小值
            }
            if(maxM < lenMap.get(x)) {
                maxM = lenMap.get(x);
                maxF = x;
            }
            else if(maxM == lenMap.get(x)){
                if(minMap.get(x) < minMap.get(maxF)) maxF = x;
            }
        }
        return minMap.get(maxF);
    }    
}
