package com.kraaken.project.Task15;

public class Main {

        private static int countSentences (String line) {
            int counter = 1;
            char [] marks = {'.', '!', '?'};
            for (int i = 0; i < line.length() - 1; i++) {
                char character = line.charAt(i);
                for (char mark : marks) {
                    if (character == mark && (line.charAt(i + 1) == ' ' || line.charAt(i + 1) == 10)) {
                        counter++;
                    }
                }
            }
            return counter;
        }

        public static void main(String[] args) {
            String lineX = "Reading practice to help \\n\" +\n" +
                    "\"you understand simple information , words and sentences about known topics . \\n \" +\n" +
                    "\"Texts include posters , messages , forms and timetables";

            System.out.println("Number of sentences per line: " + countSentences(lineX));
        }
}
