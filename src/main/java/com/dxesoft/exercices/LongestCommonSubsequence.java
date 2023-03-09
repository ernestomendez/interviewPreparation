package com.dxesoft.exercices;

/**
 * https://leetcode.com/problems/longest-common-subsequence/
 *
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string
 * with some characters (can be none) deleted without changing the relative order of the remaining characters.
 */
public class LongestCommonSubsequence {

    public int recursive(String text1, String text2) {

//        return lcsRecursive(text1.toCharArray(), text2.toCharArray(), text1.length(), text2.length());
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        return lcsRecursiveMemory(text1.toCharArray(), text2.toCharArray(), text1.length(), text2.length(), dp);
    }

    private int lcsRecursive(char[] x, char[] y, int i, int j) {
        if (i <= 0 || j <= 0) {
            return 0;
        }

        if (x[i - 1] == y[j - 1]) {
            return 1 + lcsRecursive(x, y, i - 1, j - 1);
        } else {
            return Math.max(lcsRecursive(x, y, i, j - 1), lcsRecursive(x, y, i - 1, j));
        }
    }

    private int lcsRecursiveMemory(char[] x, char[] y, int i, int j, Integer[][]dp) {
        if (i <= 0 || j <= 0) {
            return 0;
        }

        if (dp[i - 1][j - 1] != null) {
            return dp[i-1][j-1];
        }

        if (x[i - 1] == y[j - 1]) {
            return 1 + lcsRecursiveMemory(x, y, i - 1, j - 1, dp);
        } else {
            return dp[i][j] = Math.max(lcsRecursiveMemory(x, y, i, j - 1, dp), lcsRecursiveMemory(x, y, i - 1, j, dp));
        }
    }

    public int longestCommonSubsequence(String x, String y) {
        int m = x.length();
        int n = y.length();

        //genera una matriz llena de ceros
        int [][] mat = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i -1) == y.charAt(j-1)) {
                    mat[i][j] = mat[i-1][j-1] +1;
                } else {
                    mat[i][j] = Integer.max(mat[i-1][j], mat[i][j-1]);
                }
            }
        }
        return mat[m][n];
    }

}
