package Leetcode202205;
import java.util.Scanner;

public class Codeforce1674C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0){
            String s = sc.next();
            String t = sc.next();
            if(t.equals("a")){System.out.print(1);continue;}
            if(t.contains("a")) {System.out.println(-1);continue;}
            System.out.println(1<<s.length());
        }
        sc.close();
    }
}
