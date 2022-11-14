package Leetcode202211;

public class Leetcode2429 {
    public int minimizeXor(int num1, int num2) {
        int cnt2 = 0, cnt1 = 0;
        for(int i=31;i>=0;i--){
            if(((num2 >> i) & 1) > 0) cnt2++;
        }
        var oneN = new int[32];
        for(int i=0; i<32; i++){
            if(((num1 >> i) & 1) == 1){
                oneN[i] = 1;
                cnt1++;
            }
        }
        var res = num1;
        int dif = cnt2 - cnt1;
        System.out.println(cnt1+" "+ cnt2);
        if(cnt1 == cnt2) return num1;
        else if(dif > 0){
            int i = 0;
            while(dif-- > 0){
                while(i<32 && oneN[i] == 1) i++;
                if(oneN[i] == 0){
                    oneN[i] = 1;
                    res |= (1<<i);
                }
            }
            return res;
        }
        else{
            int i = 0;
            while(dif++ != 0){
                while(i<32 && oneN[i] == 0) i++;
                if(oneN[i] == 1){
                    oneN[i] = 0;
                    res ^= (1<<i);
                }
            }
            return res;
        }
    }
}
