import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Leetcode2162 {
    public static void main(String[] args) {

    }

    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int ans = 0;
        int minute = targetSeconds / 60;
        int second = targetSeconds % 60;
        if (minute == 100) {
            minute = 99;
            second += 60;
        }
        ans = setTimeCost(minute, second, moveCost, pushCost, startAt);
        if (minute > 0 && second < 40) {
            ans = Math.min(ans, setTimeCost(minute - 1, second + 60, moveCost, pushCost, startAt));
        }
        return ans;
    }

    public int setTimeCost(int minute, int second, int moveCost, int pushCost, int startAt) {
        int ans = 0;
        if (minute == 0) {
            if (second < 10) {
                ans = second == startAt ? pushCost : pushCost + moveCost;
            } else {
                ans = startAt == second / 10 ? pushCost : pushCost + moveCost;
                ans += second / 10 == second % 10 ? pushCost : pushCost + moveCost;
            }
        } else {
            if (minute < 10) {
                ans = minute == startAt ? pushCost : pushCost + moveCost;
            } else {
                ans = minute / 10 == startAt ? pushCost : pushCost + moveCost;
                ans += minute / 10 == minute % 10 ? pushCost : pushCost + moveCost;
            }
            ans += minute % 10 == second / 10 ? pushCost : pushCost + moveCost;
            ans += second / 10 == second % 10 ? pushCost : pushCost + moveCost;
        }
        return ans;
    }
}