package Leetcode202207;

public class Leetcode592 {
    public String fractionAddition(String expression) {
        var list = new ArrayList<Integer>();
        var f = false;
        int len = expression.length(), idx = 0;
        for(int i=0;i<len;i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'){
                if(f) {
                    list.add(Integer.valueOf(expression.substring(idx,i)));
                    idx = i;
                }
            }
            else if(expression.charAt(i)=='/'){
                list.add(Integer.valueOf(expression.substring(idx,i)));
                f = true;
                idx = i+1;
            }
        }
        list.add(Integer.valueOf(expression.substring(idx,len)));
        int m = list.get(0), n = list.get(1), m1=0, n1=0;
        for(int i=2;i<list.size();i=i+2){
            m1 = list.get(i);
            n1 = list.get(i+1);
            int t = lcm(n,n1);
            int m3 = m*(t/n)+m1*(t/n1);
            m = m3;
            n = t;
        }
        if(m == 0) n = 1;
        int t = gcd(Math.abs(m),Math.abs(n));
        m = m / t;
        n = n / t;
        System.out.println(m+" "+n+" "+t);
        return m+"/"+n;
    }
    public int lcm(int a, int b){
        int t = gcd(a,b);
        return a*b/t;
    }
    public int gcd(int a, int b){
        return b>0 ? gcd(b,a%b):a;
    }
}
