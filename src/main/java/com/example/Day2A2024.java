package com.example;

import java.util.ArrayList;

public class Day2A2024 {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2024/Day2Input.txt");
        System.out.println(inputs);
        if (inputs.size() > 0) {
            Integer amountSafe = 0;
            for (int i = 0; i<inputs.size(); i++) {
                String currentData = inputs.get(i);
                System.out.println(currentData);
                String[] splitData = currentData.split(" ");
                ArrayList<Integer> splitDataList = new ArrayList<Integer>();
                for(int j = 0;j < splitData.length;j++) {
                    splitDataList.add(Integer.parseInt(splitData[j]));
                } 
                System.out.println(splitDataList);
                Integer currentLevel = splitDataList.get(0);
                Integer nextLevel = splitDataList.get(1);
                Integer difference = currentLevel - nextLevel;
                String increasingOrDecreasing = "neither";
                if (difference < 0) increasingOrDecreasing = "increasing";
                else if (difference > 0) increasingOrDecreasing = "decreasing";
                else increasingOrDecreasing = "neither";
                for(int z = 0;z < splitData.length - 1;z++) {
                    currentLevel = splitDataList.get(z);
                    nextLevel = splitDataList.get(z + 1);
                    if (increasingOrDecreasing == "neither") break;
                    if (increasingOrDecreasing == "increasing") difference = nextLevel - currentLevel;
                    if (increasingOrDecreasing == "decreasing") difference = currentLevel - nextLevel;
                    if (difference < 1 || difference > 3) break;
                    if (z == splitData.length - 2) amountSafe += 1;
                }
                System.out.println(amountSafe);
            }
        }
    }
}
