package com.dxesoft.exercices;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingLeaderboardTest {

    @Test
    public void climbingLeaderboard() {

        ClimbingLeaderboard climbingLeaderboard = new ClimbingLeaderboard();
        int [] scores = {100, 90, 90, 80, 75, 60};

        int [] alice = {50, 65, 77, 90, 102};

        climbingLeaderboard.climbingLeaderboard(scores, alice);
    }
}