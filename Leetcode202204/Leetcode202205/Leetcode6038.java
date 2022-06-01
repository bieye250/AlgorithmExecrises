package Leetcode202204.Leetcode202205;
public class Leetcode6038{
    private int plusIdx;
    
    public String minimizeResult(String expression) {
        plusIdx = expression.indexOf('+');
        int minVal = Integer.MAX_VALUE;
        String resStr = null;
        for (int i = 0; i <= plusIdx - 1; i++) {
            for (int j = plusIdx + 2; j <= expression.length(); j++) {
                int result = getExpressionResult(expression, i, j);
                if (result < minVal) {
                    minVal = result;
                    resStr = insertBracket(expression, i, j);
                }
            }
        }
        return resStr;
    }

    private int getExpressionResult(String s, int leftBracket, int rightBracket) {
        char[] ca = s.toCharArray();
        int a = toNum(ca, 0, leftBracket - 1);
        int b = toNum(ca, leftBracket, plusIdx - 1);
        int c = toNum(ca, plusIdx + 1, rightBracket - 1);
        int d = toNum(ca, rightBracket, s.length() - 1);
        int res = b + c;
        if (a > 0) {
            res *= a;
        }
        if (d > 0) {
            res *= d;
        }
        return res;
    }

    private int toNum(char[] ca, int lo, int hi) {
        int res = 0;
        for (int i = lo; i <= hi; i++) {
            res = res * 10 + ca[i] - '0';
        }
        return res;
    }

    private String insertBracket(String s, int leftBracket, int rightBracket) {
        StringBuilder sb = new StringBuilder(s);
        sb.insert(rightBracket, ')');
        sb.insert(leftBracket, '(');
        return sb.toString();
    }
}