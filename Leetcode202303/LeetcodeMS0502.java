package Leetcode202303;

public class LeetcodeMS0502 {
    public String printBin(double num) {
        
        for(int i=0; i<30; i++){
            var t = (int)num;
            if(num - t == 0) {
                var s = toB(t);
                var len = s.length();
                return "0.".concat("0".repeat(i-len)).concat(s);
            }
            else num *= 2;
        }
        return "ERROR";
    }

    public String toB(int n){
        var sb = new StringBuffer();
        var f = false;
        for(int i=30; i>=0; i--){
            if(((n >> i) & 1) == 1){
                f = true;
                sb.append(1);
            }
            else if(f) sb.append(0);
        }
        return sb.toString();
    }
}
