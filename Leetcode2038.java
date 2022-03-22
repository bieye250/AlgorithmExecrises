import java.util.*;

public class Leetcode2038 {
    
    public boolean winnerOfGame(String colors) {
        var aQueue = new ArrayDeque<Integer>();
        var bQueue = new ArrayDeque<Integer>();
        for (int i = 1; i < colors.length()-1; i++){
            if (colors.charAt(i) == colors.charAt(i-1)
                && colors.charAt(i) == colors.charAt(i+1)){
                    if(colors.charAt(i) == 'A') aQueue.add(i);
                    else bQueue.add(i);
                }
        }
        while (!aQueue.isEmpty()){
            aQueue.poll();
            if (!bQueue.isEmpty()){
                bQueue.poll();
            }
            else return true;
        }
        return false;
    }
}