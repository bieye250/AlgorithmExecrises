public class Leetcode393 {
    public static void main(String[] args) {
        var l = new Leetcode393();
        l.validUtf8(new int[] { 10 });
    }

    String str = "00000000";

    public boolean validUtf8(int[] data) {
        int p = 0;
        while (p < data.length) {
            var first = binary(data[p]);
            System.out.println(first);
            int t = 0;
            while (first.charAt(t) == '1') {
                t++;
                if (t > first.length())
                    break;
            }
            if (t > data.length || t == 1 || t >= 5)
                return false;
            if (t == 0) p++;
            p += t;
            while (t > 1) {
                t--;
                var s = binary(data[t]);
                System.out.print(data[t] + ": " + s + " ");
                if (!binary(data[t]).startsWith("10"))
                    return false;
            }
        }
        return true;
    }

    public String binary(int i) {
        var s = Integer.toBinaryString(i);
        if (i >= 128)
            return s;
        else
            return str.substring(0, 8 - s.length()) + s;
    }
}
