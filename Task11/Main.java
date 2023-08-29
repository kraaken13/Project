package com.kraaken.project.Task11;

public class Main {
        private static String repeatCharacter (String line) {
            StringBuilder strBuilder = new StringBuilder();
            int doubler=2;
            for (int i = 0; i < line.length(); i++) {
                for (int j = 0; j < doubler; j++) {
                    strBuilder.append(line.charAt(i));
                }
            }
            return strBuilder.toString();
        }

        public static void main(String[] args) {
            String line = "Reading practice to help \n" +
                    "you understand simple information, words and sentences about known topics. \n " +
                    "Texts include posters, messages, forms and timetables. ";
            System.out.println(repeatCharacter(line));
        }
    }

