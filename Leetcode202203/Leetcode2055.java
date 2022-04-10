public class Leetcode2055 {
    public static void main(String[] args) {
        var s = """
                SELECT DCAV.VOUCHER_NAME,
                        DCAV.VOUCHER_CERT_TYPE,
                        DCAV.VOUCHER_CERT_NO,
                        DCAV.VOUCHER_ADDRESS,
                        DCAV.VOUCHER_COMPANY,
                        DCAV.VOUCHER_POST,
                        DCAV.VOUCHER_PHONE,
                        DCAV.VOUCHER_ASSETS,
                        DCAV.VOUCHER_MARITAL,
                        DCAV.POST_CODE,
                        DCAV.NATIONALITY,
                        DCAV.CERD_STR_DATE,
                        DCAV.CERD_END_DATE,
                        DCAV.CERD_ADDRESS,
                    '本人' RELATIONSHIP
                   FROM DMPT_CREDIT_APPLY_VOUCHER DCAV
                  WHERE VOUCHER_CERT_NO = '"+ row.get("VOUCHER_CERT_NO")
                   AND DEALER_NO = '"+ row.get("DEALER_NO")
                    AND APPLY_NO = '"+ row.get("APPLY_NO")
                    """;
        System.out.println(s);
        var l = new Leetcode2055();
        l.platesBetweenCandles("***|**|*****|**||**|*", new int[][] { { 1, 17 } });
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] preSum = new int[n];
        for (int i = 0, sum = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                sum++;
            }
            preSum[i] = sum;
        }
        int[] left = new int[n];
        for (int i = 0, l = -1; i < n; i++) {
            if (s.charAt(i) == '|') {
                l = i;
            }
            left[i] = l;
        }
        int[] right = new int[n];
        for (int i = n - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                r = i;
            }
            right[i] = r;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x = right[query[0]], y = left[query[1]];
            ans[i] = x == -1 || y == -1 || x >= y ? 0 : preSum[y] - preSum[x];
        }
        return ans;
    }
}
