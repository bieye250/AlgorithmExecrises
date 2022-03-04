public class Leetcode2182 {
    public static void main(String[] args) {
        
    }

    public String repeatLimitedString(String s, int repeatLimit) {
        var a = new int[26];
        s.chars().forEach(i->a[i-'a']++);
        var flag = false;
        var sb = new StringBuilder();
        for(int i=25; i >= 0; i--){
            if(a[i] != 0){
                int t = i - 1;
                while(a[i] > repeatLimit){
                    if(flag){
                        while(t>=0 && a[t]==0) t--;
                        if(t < 0) break;
                        else{
                            sb.append((char)a[t]);a[t]--;
                        }
                    }
                    for(int j=0;i<repeatLimit;j++) sb.append((char)a[i]);
                    a[i] -= repeatLimit;
                    flag = true;
                }
                if(a[i] > 0 && a[i] < repeatLimit)
                    for(int j=0;i<repeatLimit;j++) sb.append((char)a[i]);
            }
        }
        return sb.toString();
    }
}
