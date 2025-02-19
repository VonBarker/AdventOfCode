package com.example;

import java.util.ArrayList;

public class Day1A {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2015/Day1Input.txt");
        System.out.println(inputs);
        if (inputs.size() > 0) {
            for (int i = 0; i<inputs.size(); i++) {
                String currentData = inputs.get(i);
                System.out.println(currentData);
                int answer = 0;
                for (char currentChar : currentData.toCharArray()) {
                    if (currentChar == '(') answer++;
                    else if (currentChar == ')') answer--;
                }
                System.out.println(answer);
            }
        }
    }
}