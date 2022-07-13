import java.util.Arrays;

public class Leetcode735{
    public int[] asteroidCollision(int[] asteroids) {
        int len = asteroids.length;
        for(int i=0;i<len-1;i++){
            if(asteroids[i]*asteroids[i+1]<0){
                if(asteroids[i]<0){
                    crash(asteroids,i);
                }
                else {
                    crash(asteroids,i+1);
                }
            }
        }
        Arrays.stream(asteroids).forEach(System.out::println);
        return Arrays.stream(asteroids).filter(i->i!=0).toArray();
    }
    public void crash(int[] asteroids, int i){
        int t = (~asteroids[i])+1;
        for(int j=i-1;j>=0;j--){
            if(asteroids[j]>0){
                if(t>asteroids[j]) asteroids[j]=0;
                else if(t==asteroids[j]){
                    asteroids[j]=0;
                    asteroids[i]=0;break;
                }
                else {asteroids[i]=0;break;}
            }
            else if(asteroids[j]<0) break;
        }
    }
}