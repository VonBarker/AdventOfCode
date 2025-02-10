package com.example;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("src/main/resources/2015/Day1Test.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public static ArrayList<String> getInput(String filePath) {
    ArrayList<String> data = new ArrayList<String>();
    try {
      File myObj = new File(filePath);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String lineData = myReader.nextLine();
        data.add(lineData);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println(e.toString());
    }
    return data;
  }
}