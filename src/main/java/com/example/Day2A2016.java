package com.example;

import java.util.ArrayList;

public class Day2A2016 {
    public static void main(String[] args) {
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/2016/Day2Input.txt");
        System.out.println(inputs);

        // Create the numpad
        ArrayList<ArrayList<String>> numpad = new ArrayList<ArrayList<String>>();
        Integer number = 1;
        for (int row = 0; row < 3; row++) {
            ArrayList<String> currentRow = new ArrayList<String>();
            for (int column = 0; column < 3; column++) {
                currentRow.add(number.toString());
                number++;
            }
            numpad.add(currentRow);
        }
        System.out.println(numpad);
        System.out.println(numpad.get(0));
        System.out.println(numpad.get(1));
        System.out.println(numpad.get(2));

        String answer = "";
        Integer x = 1;
        Integer y = 1;
        if (inputs.size() > 0) {
            for (int i = 0 ; i < inputs.size() ; i++) {
                String currentData = inputs.get(i);
                System.out.println(currentData);
                
                for (char currentChar : currentData.toCharArray()) {
                    if (currentChar == 'U' && y != 0) y--;
                    else if (currentChar == 'D' && y != 2) y++;
                    else if (currentChar == 'L' && x != 0) x--;
                    else if (currentChar == 'R' && x != 2) x++;
                    System.out.println(numpad.get(y).get(x));
                }
                answer = answer + numpad.get(y).get(x);
                System.out.println(answer);
            }
        }
    }
}
