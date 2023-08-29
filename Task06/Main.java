package com.kraaken.project.Task06;

public class Main {
    private static int findMoreSpaces(String line) {
        int counter = 0;
        int maxCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String line = " Воспитанные люди должны удовлетворять следующим условиям:\n" +
                " Они уважают человеческую личность, всегда снисходительны, мягкие, вежливые, уступчивые…\n" +
                " Они уважают чужую собственность, а потому платят долги.\n" +
                " Не лгут даже в пустяках… Они не лезут с откровенностями, когда их не спрашивают…\n" +
                " Они не унижают себя с тою целью,          чтобы вызвать в другом сочувствие…\n" +
                " Они не суетны…\n" +
                " Если имеют в себе талант, то уважают его… Они жертвуют для него всем…\n" +
                " Они воспитывают в себе эстетику*…\n" +
                "  Тут нужны беспрерывные дневной и ночной труд, вечное чтение, воля… Тут дорог каждый час.";
        int moreSpaces = findMoreSpaces(line);
        System.out.println(moreSpaces);
    }
}
