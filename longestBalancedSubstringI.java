public class longestBalancedSubstringI {
    public static int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            int[] cnt = new int[26];
            int mx = 0;   // max frequency of any character in current substring
            int v = 0;    // number of distinct characters

            for (int j = i; j < n; ++j) {
                int c = s.charAt(j) - 'a';

                if (cnt[c] == 0) {
                    v++;
                }
                cnt[c]++;
                mx = Math.max(mx, cnt[c]);
                
                if (mx * v == j - i + 1) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(longestBalanced(s));
    }
}
