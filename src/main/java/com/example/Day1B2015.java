package com.example;

import java.util.ArrayList;

public class Day1B2015 {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2015/Day1Input.txt");
        System.out.println(inputs);
        if (inputs.size() > 0) {
            for (int i = 0; i<inputs.size(); i++) {
                String currentData = inputs.get(i);
                System.out.println(currentData);
                int answer = 0;
                int basementTime = 0;
                for (char currentChar : currentData.toCharArray()) {
                    if (currentChar == '(') answer++;
                    else if (currentChar == ')') answer--;
                    basementTime++;
                    if (answer == -1) break;
                }
                System.out.println(answer);
                System.out.println(basementTime);
            }
        }
    }
}
