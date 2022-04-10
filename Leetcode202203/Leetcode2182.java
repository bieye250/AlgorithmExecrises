public class Leetcode2182 {
    public static void main(String[] args) {
        var l = new Leetcode2182();
        l.repeatLimitedString("gapqzytcgvbqnyucmvhzusqrebydzqnlyqjlglssdhjgiecnritocbfexnvnmrgcoayorbmexhazxtwshari", 9);
    }

    public String repeatLimitedString(String s, int repeatLimit) {
        var a = new int[26];
        s.chars().forEach(i -> a[i - 'a']++);
        var sb = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            if (a[i] != 0) {
                int t = i - 1;
                boolean flag = false;
                while (a[i] > repeatLimit) {
                    for (int j = 0; j < repeatLimit; j++) sb.append((char) (i + 'a'));
                    a[i] -= repeatLimit;
                        while (t >= 0 && a[t] == 0)
                            t--;
                        if (t < 0){
                            flag = true;break;}
                        else {
                            sb.append((char)(t+'a'));
                            a[t]--;
                        }
                }
                if (!flag && a[i] > 0 && a[i] <= repeatLimit) {
                    int min = Math.min(repeatLimit, a[i]);
                    for (int j = 0; j < min; j++) sb.append((char) (i + 'a'));
                    a[i] = 0;
                }
            }
        }
        return sb.toString();
    }
}
