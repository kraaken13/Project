package com.kraaken.project.Task13;
import java.io.IOException;


public class Main {


    private static String findLongestWord(String line) {
        String longestWord = "";
        int maxLenght = 0;
        String[] words = line.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) throws IOException {
        String line = "Reading practice to help \\n\" +\n" +
                "\"you understand simple information , words and sentences about known topics . \\n \" +\n" +
                "\"Texts include posters , messages , forms and timetables .";
        System.out.println(findLongestWord(line));
    }
}

