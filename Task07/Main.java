package com.kraaken.project.Task07;

public class Main {
    private static String addSymbol (String line) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                strBuilder.append("ab");
            } else {
                strBuilder.append(line.charAt(i));
            }
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "Reading practice to help \n" +
                "you understand simple information, words and sentences about known topics. \n " +
                "Texts include posters, messages, forms and timetables. ";
        System.out.println(addSymbol(line));
    }
}

