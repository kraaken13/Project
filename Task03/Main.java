package com.kraaken.project.Task03;

public class Main {
    private static int countDigits(String line) {
        int digit = 0;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < line.length(); i++) {
            for (char element : digits) {
                if (line.charAt(i) == element) {
                    digit++;
                }
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        String line = "1 Урок-Математика" +
                "2 Урок-География" +
                "3 Урок-Биология";
        System.out.println(countDigits(line));
    }
}



