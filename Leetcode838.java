public class Leetcode838 {
    public static void main(String[] args) {

    }

    public String pushDominoes(String dominoes) {
        if(dominoes.length() == 1) return dominoes;
        StringBuffer sb = new StringBuffer();
        int left = 0, right = 0, len = dominoes.length();
        
        int[] a = new int[len];
        for (int i = 0; i < dominoes.length(); i++) {
            if(dominoes.charAt(i)=='L') a[i] = 1;
            else if(dominoes.charAt(i)=='R') a[i] = 2;
        }
        for(int i=0;i<len;i++){
            if(a[i]==1){
                int t = i-1;
                left = i;
                while(t>=0) a[t--]=1;break;
            }
            else if(a[i]==2) {left = i;break;}
        }
        for(int i=len-1;i>=0;i--){
            if(a[i]==2){
                int t = i+1;
                right = i;
                while(t<len) a[t++]=2;break;
            }
            else if(a[i]==1) {right = i;break;}
        }
        for(int i=left;i<=right;i++){
            if(a[i] > 0){
                int t = i++;
                while(i<=right && a[i]==0) i++;
                if(i<=right){
                    if(a[t]==a[i]){
                        while(t<=i) a[t++]=a[i];
                    }
                    else if(a[t]==2 && a[i]==1){
                        int p = i -1;
                        ++t;
                        while(p>t){
                            a[p--] = 1;
                            a[t++] = 2;
                        }
                    }
                }
            }
        }
        for(int i=0;i<len;i++){
            if(a[i]==0)  sb.append('.');
            else if(a[i]==1) sb.append('L');
            else sb.append('R');
        }
        return sb.toString();
    }
}
