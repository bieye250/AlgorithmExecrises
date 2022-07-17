package Leetcode202207;
import java.util.Arrays;

public class Leetcode6111 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        var ans = new int[m][n];
        Arrays.fill(ans,-1);
        int row=0, col=0;
        boolean left = false, up = false;
        while(head!=null){
            while(col<n&&ans[row][col]<0&&head!=null){
                ans[row][col] = head.val;
                col++;
                head = head.next;
            }
            col--;row++;
            while(row<m&&ans[row][col]<0&&head!=null){
                ans[row][col] = head.val;
                row++;
                head = head.next;
            }
            row--;col--;
            while(col>=0&&ans[row][col]<0&&head!=null){
                ans[row][col]= head.val;
                col--;
                head = head.next;
            }
            col++;row--;
            while(row>=0&&ans[row][col]<0&&head!=null){
                ans[row][col] = head.val;
                row--;
                head = head.next;
            }
            row++;col++;
        }
        return ans;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
