import java.util.*;

public class Leetcode969 {
    public static void main(String[] args) {
        var l = new Leetcode969();
        var list = l.pancakeSort(new int[] { 2, 1, 3 });
        for (int i : list)
            System.out.println(i);
    }

    public List<Integer> pancakeSort(int[] arr) {
        if (check(arr))
            return new ArrayList<>();
        int len = arr.length, t = len;
        var list = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            if (arr[i] == t) {
                if (i + 1 != t) {
                    list.add(i + 1);
                    list.add(t);
                    change(arr, i);
                    change(arr, t - 1);
                }
                t--;
                i = -1;
            }
            if (t == 1)
                break;
        }
        return list;
    }

    /*
     * 3 2 4 1
     * 4 2 3 1
     * 1 3 2 4
     * 3 1 2 4
     * 2 1 3 4
     * 1 2 3 4
     */
    public void change(int[] arr, int j) {
        // i < j /2 j+1 / 2
        int t = (j + 1) >> 1;
        for (int i = 0; i < t; i++) {
            arr[i] = arr[i] ^ arr[j - i];
            arr[j - i] = arr[i] ^ arr[j - i];
            arr[i] = arr[i] ^ arr[j - i];
        }
    }

    public boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return false;
        }
        return true;
    }
}