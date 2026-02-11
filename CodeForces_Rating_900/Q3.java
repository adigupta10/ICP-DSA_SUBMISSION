package CodeForces_Rating_900;

import java.util.*;
public class Q3 {
// https://codeforces.com/contest/1593/problem/B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int ans = Integer.MAX_VALUE;

            String[] end = {"00", "25", "50", "75"};

            for (String e : end) {
                int cnt = 0;
                int j = n - 1;

                // find second digit
                while (j >= 0 && s.charAt(j) != e.charAt(1)) {
                    cnt++;
                    j--;
                }
                if (j < 0) continue;

                j--;

                // find first digit
                while (j >= 0 && s.charAt(j) != e.charAt(0)) {
                    cnt++;
                    j--;
                }
                if (j < 0) continue;

                ans = Math.min(ans, cnt);
            }

            System.out.println(ans);
        }
    }
}