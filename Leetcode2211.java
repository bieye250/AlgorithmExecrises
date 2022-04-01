import java.util.ArrayDeque;

public class Leetcode2211{
    
    public static void main(String[] args) {
        var l = new Leetcode2211();
        l.countCollisions("RLRSLL");
    }
    public int countCollisions(String directions) {
        int ans = 0, p = 1;
        char[] c = directions.toCharArray();
        var deque = new ArrayDeque<Character>();
        deque.offer(c[0]);
        while (p < c.length){
            char ch = deque.peek();
            if (ch == c[p]) deque.offer(ch);
            else if (ch == 'L') deque.offer(c[p]);
            else if (ch == 'R'){
                    if (c[p] == 'S') ans++;
                    else ans += 2;
                    deque.offer('S');}
            else if (ch =='S'&&c[p]=='L'){ans++;deque.offer('S');}
            else deque.offer(c[p]);
            p++;
        }
        return ans;
    }
}