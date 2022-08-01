package Leetcode202207;

import java.util.Scanner;

public class iFLYTEK0722 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            String[] s = in.nextLine().split("\\+");
            String num1 = s[0];
            String num2 = s[1];
            int len1 = num1.length(), len2=num2.length();
            long ans = 0L;
            for(int j=0;j<len1;j++){
                long n1 = Long.parseLong(num1.substring(j, len1));
                long a = 1L, b = 1L;
                if(j > 0) a = Long.valueOf(num1.substring(0,j));
                for(int k=0;k<len2;k++){
                    long n2 = Long.parseLong(num2.substring(0, k));
                    if(k < len2-1) b = Long.valueOf(num2.substring(k,len2));
                    ans = Math.max(ans,a*(n1+n2)*b);
                }
                System.out.println(ans);
                StringBuffer sb = new StringBuffer();
                sb.insert(0,'(');
            }
        }
    }
}
