package Leetcode202209;

public class GospersHack {
    //n元集合所有k元子集
    void gospersHack(int k, int n){
        var cur = (1<<k) - 1;
        var limit = (1<<n);
        while(cur < limit){
            int lowbit = cur & (-cur);
            int r = cur + lowbit;
            cur = (((r ^ cur) >>2 )/lowbit) | r;
        }
    }
    //参考: https://zhuanlan.zhihu.com/p/360512296
}
