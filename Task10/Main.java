package com.kraaken.project.Task10;

public class Main {
    private static int countCharacter(String line, char ch) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String line = "Reading practice to help \n" +
                "you understand simple information, words and sentences about known topics. \n " +
                "Texts include posters, messages, forms and timetables. ";
        System.out.println(countCharacter(line, 'a'));
    }
}

