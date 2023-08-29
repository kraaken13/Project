package com.kraaken.project.Task12;

public class Main {


    private static String removeReplays(String line) {
        StringBuilder strBuilder = new StringBuilder(line);
        for (int i = 0; i < strBuilder.length(); i++) {
            char ch = strBuilder.charAt(i);


            if (ch == ' ') {
                strBuilder.deleteCharAt(i);
                i--;
                continue;
            }


            for (int j = i + 1; j < strBuilder.length(); j++) {
                if (strBuilder.charAt(j) == ch) {
                    strBuilder.deleteCharAt(j);
                }
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "abc cde def" ;

        System.out.println(removeReplays(line));
    }
}

