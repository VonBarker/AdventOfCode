package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2015/Day1Test.txt");
        System.out.println(inputs);
        if (inputs.size() > 0) {
            for (int i=0; i<inputs.size(); i++) {
                System.out.println(inputs.get(i));
            }
        }
    }
}