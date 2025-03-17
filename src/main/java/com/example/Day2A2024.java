package com.example;

import java.util.ArrayList;

public class Day2A2024 {
    public static void main(String[] args) {
        // Get the data and store as a list of inputs
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2024/Day2Input.txt");
        System.out.println(inputs);
        if (inputs.size() > 0) {
            Integer amountSafe = 0;

            // Loop through each input and check to see if it is safe or not
            for (String i : inputs) {
                System.out.println(i);
                String[] splitData = i.split(" ");
                ArrayList<Integer> splitDataList = new ArrayList<Integer>();
                for(String j : splitData) {
                    splitDataList.add(Integer.parseInt(j));
                } 
                System.out.println(splitDataList);

                // Check to see if the input is increasing or decreasing
                Integer currentLevel = splitDataList.get(0);
                Integer nextLevel = splitDataList.get(1);
                Integer difference = currentLevel - nextLevel;
                String increasingOrDecreasing = "neither";
                if (difference < 0) increasingOrDecreasing = "increasing";
                else if (difference > 0) increasingOrDecreasing = "decreasing";
                else increasingOrDecreasing = "neither";

                // Loop through levels and as soon as it is unsafe break out. If it makes it to the end then it is safe
                for(int z = 0;z < splitDataList.size() - 1;z++) {
                    currentLevel = splitDataList.get(z);
                    nextLevel = splitDataList.get(z + 1);
                    if (increasingOrDecreasing == "neither") break;
                    if (increasingOrDecreasing == "increasing") difference = nextLevel - currentLevel;
                    if (increasingOrDecreasing == "decreasing") difference = currentLevel - nextLevel;
                    if (difference < 1 || difference > 3) break;

                    // If we make it through the loop, it's safe, add 1 to the number of safe inputs
                    if (z == splitDataList.size() - 2) amountSafe += 1;
                }
                // Output the number of safe inputs
                System.out.println(amountSafe);
            }
        }
    }
}
