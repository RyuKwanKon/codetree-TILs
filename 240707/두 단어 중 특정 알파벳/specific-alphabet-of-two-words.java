import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());

        int[][][] dp = new int[n][2][26];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            String f = st.nextToken();
            String s = st.nextToken();

            for (int j = 0; j < f.length(); j++) {
                int idx = (int) f.charAt(j) - 97;
                dp[i][0][idx]++;
            }

            for (int j = 0; j < s.length(); j++) {
                int idx = (int) s.charAt(j) - 97;
                dp[i][1][idx]++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int k = 0; k < 2; k++) {
                for (int j = 0;  j < 26; j++) {
                    dp[i][k][j] = Math.max(dp[i][k][j] + dp[i - 1][0][j], dp[i][k][j] + dp[i - 1][1][j]);
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(Math.max(dp[n - 1][0][i], dp[n - 1][1][i]));
        }
    }
}