package com.dxesoft.exercices;

import java.util.List;
import java.util.stream.Collectors;

public class CountTeams {

    public CountTeams() {
    }

    public void CountTeams() {
        System.out.println("estoy en count");
    }

    public int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {

        final List<Integer> validSkills = removeLevels(skills, minLevel, maxLevel);

        if (validSkills.size() < minPlayers) {
            return 0;
        }

        if (validSkills.size() == minPlayers) {
            return 1;
        }

        final int delta = validSkills.size() - minPlayers;

        int total = 0;
        for (int i = 0; i <= delta; i++) {
            total += combinationsNR(validSkills.size(), minPlayers + i);
        }

        return total;


    }

    private List<Integer> removeLevels(List<Integer> skills, int minLevel, int maxLevel) {
        return skills.stream()
                .filter(skill -> skill >= minLevel && skill <= maxLevel)
                .collect(Collectors.toList());
    }

    private int fact(int n) {
        int r = 1;

        for (int i = 2; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

    private int combinationsNR(int n, int r) {
        return fact(n)/(fact(r) * fact(n - r));
    }
}
