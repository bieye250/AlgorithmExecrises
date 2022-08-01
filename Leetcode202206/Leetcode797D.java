package Leetcode202206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Leetcode797D {
  private InputReader in = new InputReader(System.in);
  private PrintWriter out = new PrintWriter(System.out);

  public void solve() {
    int t = in.ni();
    while (t-- > 0) {
      int n = in.ni(), k = in.ni();
      char[] x = in.next().toCharArray();
      int[] prefix = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        prefix[i] = prefix[i - 1];
        if (x[i - 1] == 'W') {
          prefix[i]++;
        }
      }
      int result = Integer.MAX_VALUE;
      for (int i = 1; i <= n - k + 1; i++) {
        result = Math.min(result, prefix[i + k - 1] - prefix[i - 1]);
      }
      out.println(result);
    }
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int ni() {
      return Integer.parseInt(next());
    }

    public long nl() {
      return Long.parseLong(next());
    }

    public void close() throws IOException {
      reader.close();
    }
  }

  public static void main(String[] args) throws IOException {
    Leetcode797D instance = new Leetcode797D();
      instance.solve();
  }
}