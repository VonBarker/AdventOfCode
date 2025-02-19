package com.example;

import java.util.ArrayList;

public class Day2A {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2015/Day2Input.txt");
        System.out.println(inputs);
        if (inputs.size() > 0) {
            int totalPaperNeeded = 0;
            for (int i = 0; i<inputs.size(); i++) {
                String currentData = inputs.get(i);
                System.out.println(currentData);
                String[] splitData = currentData.split("x");
                ArrayList<Integer> sideLengths = new ArrayList<Integer>();
                for(int z = 0;z < splitData.length;z++)
                {
                    sideLengths.add(Integer.parseInt(splitData[z]));
                } 
                sideLengths.sort(null);
                System.out.println(sideLengths);
                int smallestSide = sideLengths.get(0)*sideLengths.get(1);
                int sideTwo = sideLengths.get(0)*sideLengths.get(2);
                int sideThree = sideLengths.get(1)*sideLengths.get(2);
                System.out.println(smallestSide);
                System.out.println(sideTwo);
                System.out.println(sideThree);
                int surfaceArea = 2*smallestSide + 2*sideTwo + 2*sideThree;
                System.out.println(surfaceArea);
                int paperNeeded = surfaceArea + smallestSide;
                System.out.println(paperNeeded);
                totalPaperNeeded += paperNeeded;
            }
            System.out.println(totalPaperNeeded);
        }
    }
}