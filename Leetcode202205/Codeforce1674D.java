package Leetcode202205;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Codeforce1674D{
    
}
class Main {

    void solve_test() {
        
            int n = ri();
            int[] a = new int[n];
            for(int i = 0; i <n; i++) a[i] = ri();
            for(int i = n % 2; i +1 < n; i+=2) {
                if(a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
            
            for(int i = 0; i +1 < n; i++) {
                if(a[i] > a[i + 1]) {
                    out.println("NO");
                    return;
                }
            }
            
            out.println("YES");
    }
    
    void solve() {
        int tt = ri();
        while(tt-- > 0) {
            solve_test();
         }
    }
    
    
    public static void main(String[] args) {
        new Main().run();
    }
    
    void run() {
        try {
            solve();
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    
    String readLine() {
        try {
            return in.readLine();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    String rs() {
        while(!tok.hasMoreTokens()) {
            tok = new StringTokenizer(readLine());
        }
        
        return tok.nextToken();
    }
    
    int ri() {
        return Integer.parseInt(rs());
    }
    
    long rl() {
        return Long.parseLong(rs());
    }
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    StringTokenizer tok = new StringTokenizer("");
}