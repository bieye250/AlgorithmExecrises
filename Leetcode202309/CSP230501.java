package Leetcode202309;

import java.util.Scanner;

public class CSP230501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    var cnt = new String[n][8];
    for(int i=0; i<n; i++){
        for(int j=0; j<8; j++)  cnt[i][j] = sc.next();
    }

    System.out.println(1);
    for(int i=1; i<n; i++){
        var t = 1;
        for(int j=i-1; j>=0; j--){
            var f = true;
            for(int k=0; k<8; k++){
                if(!cnt[i][k].equals(cnt[j][k])){
                    f = false;
                    break;
                }
            }
            if(f) t++;
        }
        System.out.println(t);
    }
    }
}
