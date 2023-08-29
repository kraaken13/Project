package com.kraaken.project.Task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {




        private static int countLowerCase(String line) {
            int counter = 0;
            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                if (letter >= 'a' && letter <= 'z') {
                    counter++;
                }
            }

            return counter;
        }

        private static int countUpperCase(String line) {
            int counter = 0;
            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                if (letter >= 'A' && letter <= 'Z') {
                    counter++;
                }
            }

            return counter;
        }

        public static void main(String[] args) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = "Reading practice to help \\n\" +\n" +
                    "\"you understand simple information , words and sentences about known topics . \\n \" +\n" +
                    "\"Texts include posters , messages , forms and timetables .";


            System.out.printf("Lower case letter: %d%n", countLowerCase(line));
            System.out.printf("Upper case letter: %d%n", countUpperCase(line));
        }
    }

