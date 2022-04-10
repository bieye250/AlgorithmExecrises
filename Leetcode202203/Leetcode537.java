public class Leetcode537 {
    public static void main(String[] args) {

    }

    public String complexNumberMultiply(String num1, String num2) {
        int a = 0, b = 0, c = 0, d = 0;
        var s1 = new StringBuffer(num1);
        s1.deleteCharAt(num1.length() - 1);
        var s2 = new StringBuffer(num2);
        s2.deleteCharAt(num2.length() - 1);
        var str1 = s1.toString().split("+");
        var str2 = s2.toString().split("+");
        a = Integer.parseInt(str1[0]);
        b = Integer.parseInt(str1[1]);
        c = Integer.parseInt(str2[0]);
        d = Integer.parseInt(str2[1]);
        int t = a*c-b*d;
        int t1 = a*d+b*c;
        return String.valueOf(t)+"+"+String.valueOf(t1)+"i";
    }
}