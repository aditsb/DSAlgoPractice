package com.dsalgo.practice.array;

import java.util.*;

public class TournamentWinnerSol1 {

    public static String getTournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        // Write your code here.
        String currentBestTeam = "";
        resultMap.put(currentBestTeam, 0);
        for (int count = 0; count < results.size(); count++) {
            int result = results.get(count);
            String winner = result == 0 ? competitions.get(count).get(1) : competitions.get(count).get(0);
            extracted(winner, resultMap);
             if(resultMap.get(winner)>resultMap.get(currentBestTeam)){
                 currentBestTeam=winner;
             }


        }

        return currentBestTeam;
    }

    private static void extracted(String winner, HashMap<String, Integer> resultMap) {
        if (resultMap.containsKey(winner)) {
            resultMap.put(winner, resultMap.get(winner) + 1);
        } else {
            resultMap.put(winner, 1);

        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>();
        competition1.add("HTML");
        competition1.add("C#");
        competitions.add(competition1);

        ArrayList<String> competition2 = new ArrayList<>();
        competition2.add("C#");
        competition2.add("Python");
        competitions.add(competition2);
        ArrayList<String> competition3 = new ArrayList<>();
        competition3.add("Python");
        competition3.add("HTML");
        competitions.add(competition3);

        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        System.out.println(getTournamentWinner(competitions, results));


    }
}
