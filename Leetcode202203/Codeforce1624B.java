import java.util.Scanner;

public class Codeforce1624B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = (c-a)>>1;
            if((a+d)%b==0 && a+2*d == c) {
                System.out.println("YES");
                continue;
            }
            d = c - b;
            if((b-d)%a==0 && b > d){
                System.out.println("YES");
                continue;
            }
            d = b - a;
            if((b+d)%c==0 && b+d>0){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }//a + (a+d) + (a+2d) = 3a+3d = 3(a+d)    
        sc.close();
    }
}