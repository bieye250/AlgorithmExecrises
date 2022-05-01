import java.util.ArrayDeque;
import java.util.Scanner;

public class Codeforce784{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] c = new char[n][m];
			for(int i=0;i<n;i++){
				var s = sc.next();
				for(int j=0;j<m;j++) c[i][j] = s.charAt(j);
			}
			for(int i=0; i<m;i++){
				var deque = new ArrayDeque<Character>();
				for(int j=0;j<n;j++){
					if(c[j][i]=='*') {
						deque.add('*');
						c[j][i]='.';
					}
					else if(c[j][i]=='o'){
						int p = j-1;
						while(!deque.isEmpty()) c[p--][i]=deque.poll();
					}
					if(j==n-1 && !deque.isEmpty()){
						int p = n-1;
						while(!deque.isEmpty()) c[p--][i]=deque.poll();
					}
				}
			}
			for(int i=0;i<n;i++) System.out.println(String.valueOf(c[i]));
		}
    }
} 