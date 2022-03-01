import java.util.ArrayList;
import java.util.List;

public class Leetcode6 {
    public static void main(String[] args) {
        var l = new Leetcode6();
        l.convert("PAYPALISHIRING", 3);
    }

    public String convert(String s, int numRows) {
        if(s.length() <= numRows) return s;

        List<StringBuffer> list = new ArrayList<>(numRows);
        for(int i=0; i < list.size(); i++){
            list.add(new StringBuffer());
        }
        int sum = -2 + (numRows<<1);
        int[] a= new int[sum];
        for(int i = 0; i < sum; i++){
            if(i < numRows)
                a[i] = i;
            else a[i] = numRows - i % numRows -2;
        }
        int i = 0;
        while(i < s.length()){
            list.get(a[i%sum]).append(s.charAt(i));
            i++;
        }
        StringBuffer sb = list.get(0);
        for(i=1;i<list.size();i++)
            sb.append(list.get(i));
        return sb.toString();
    }
}
