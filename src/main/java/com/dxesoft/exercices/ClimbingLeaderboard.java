package com.dxesoft.exercices;

public class ClimbingLeaderboard {

    public int[] climbingLeaderboard(int[] scores, int[] aliceResults) {
        int[] rank = initialScore(scores);

        int[] aliceRank = new int[aliceResults.length];

        for (int i = 0; i < aliceResults.length; i++) {
            int scorePosition = getScorePosition(scores, aliceResults[i], 0, scores.length - 1);

            if (aliceResults[i] == scores[scorePosition]) {
                aliceRank[i] = rank[scorePosition];
            } else if (aliceResults[i] > scores[scorePosition]) {
                aliceRank[i] = rank[scorePosition];
            } else {
                aliceRank[i] = rank[scorePosition] + 1;
            }
        }
        return aliceRank;

    }

    private int getScorePosition(int[] scores, int alice, int origin, int end) {
        int n = end - origin;

        int response;
        if (n < 2) {
            if (scores[end] > alice)
                return end;
            else
                return origin;
        }

        int mid = n / 2;

        int midPos = origin + mid;

        if (scores[midPos] == alice) {
            return midPos;
        } else if (scores[midPos] > alice) {
            response = getScorePosition(scores, alice, midPos + 1, end);
        } else {
            response = getScorePosition(scores, alice, origin, midPos);
        }

        return response;
    }

    private int[] initialScore(int[] scores) {
        int[] rank = new int[scores.length];

        int actualRank = 1;

        rank[0] = actualRank;
        for (int i = 1; i < scores.length; i++) {
            if(scores[i -1] == scores[i]) {
                rank[i] = rank[i -1];
            } else {
                rank[i] = rank[i-1] + 1;
            }
        }

        return rank;
    }
}
