import java.util.Arrays;

public class Leetocde6076 {
    public int minimumLines(int[][] stockPrices) {
        Arrays.sort(stockPrices,(a,b)->a[0]-b[0]);
        int len = stockPrices.length;
        if(len == 1) return 0;
        int ans = len - 1;
        long x0=stockPrices[0][0], y0=stockPrices[0][1];
        for(int i=2; i<len; i++){
            long x1=stockPrices[i-1][0], y1=stockPrices[i-1][1];
            long x2 = stockPrices[i][0], y2=stockPrices[i][1];
            if((y2-y1)*(x1-x0)==(y1-y0)*(x2-x1)) ans--;    
            x0=x1; y0=y1;
        }
        return ans; 
    }
}
