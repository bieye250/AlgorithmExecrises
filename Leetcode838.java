public class Leetcode838 {
    public static void main(String[] args) {

    }

    public String pushDominoes(String dominoes) {
        if(dominoes.length() == 1) return dominoes;
        StringBuffer sb = new StringBuffer();
        int p = 0, len = dominoes.length();
        for(int i=0;i<dominoes.length();i++){
            if(dominoes.charAt(i)=='L'){
                p = i;
                while(--i>=0){
                    sb.append('L');
                }
                sb.append('L');
                break;
            }
            else if(dominoes.charAt(i)=='R'){
                p = i;
                while(--i>=0) sb.append('.');
                sb.append('R');
                break;
            }
        }
        for(int i=p;i<dominoes.length();i++){
            if(dominoes.charAt(i)=='L' || dominoes.charAt(i)=='R'){
                sb.append(dominoes.charAt(i));
                int t = i++;
                while(i<len && dominoes.charAt(i)=='.') i++; 
                if(i < len){
                    
                }
            }
        }
    }
}
