import java.util.*;
public class LCS {
    static String findLCS(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                dp[i][j] = (a.charAt(i - 1) == b.charAt(j - 1))
                        ? dp[i - 1][j - 1] + 1
                        : Math.max(dp[i - 1][j], dp[i][j - 1]);
        StringBuilder s = new StringBuilder();
        for (int i = m, j = n; i > 0 && j > 0;)
            if (a.charAt(i - 1) == b.charAt(j - 1)) { s.append(a.charAt(--i)); j--; }
            else if (dp[i - 1][j] > dp[i][j - 1]) i--; else j--;
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: "); String s1 = sc.nextLine();
        System.out.print("Enter second string: "); String s2 = sc.nextLine();
        String lcs = findLCS(s1, s2);
        System.out.println("\nString 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Length of LCS: " + lcs.length());
        System.out.println("LCS: " + lcs);
        sc.close();
    }
}
