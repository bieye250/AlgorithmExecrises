package Leetcode202205;
import java.util.Arrays;
public class Leetcode6068 {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, (o1, o2) -> o1[0] - o2[0]);
        int n = tiles.length, l = 0, r = 0, sum = 0, max = 0;
        while (r < n && l < n) {
          int leftBoundary = tiles[l][0], rightBoundary = leftBoundary + carpetLen - 1;
          //未覆盖完
          if (tiles[r][1] <= rightBoundary) {
            sum += tiles[r][1] - tiles[r][0] + 1;
            r++;
            max = Math.max(sum, max);
          } else {
            //覆盖部分
            if(rightBoundary >= tiles[r][0]){
              max = Math.max(sum + rightBoundary - tiles[r][0] + 1, max);
            }
            //调整到下一个区间开头
            sum -= tiles[l][1] - tiles[l][0] + 1;
            l++;
          }
        }
        return max;
      }
}
