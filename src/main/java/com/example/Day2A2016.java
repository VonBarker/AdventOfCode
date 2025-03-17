package com.example;

import java.util.ArrayList;

public class Day2A2016 {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2016/Day2Test.txt");
        System.out.println(inputs);

        if (inputs.size() > 0) {
            for (int i = 0; i<inputs.size(); i++) {
                String currentData = inputs.get(i);
                System.out.println(currentData);
            }
        }
    }
}
