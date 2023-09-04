package com.kraaken.project.lesson03.patternmatcher.task16;

import java.util.Scanner;

public class Main {
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String text = "Утро в середине ноября могло быть самым обыкновенным, если бы за ночь не выпало столько снега. Всё вокруг в один миг преобразилось, как в волшебной сказке. Белоснежные сугробы покрыли мостовые, аллеи в парках, узкие дорожки во дворах, машины, как будто кто-то накинул большую накрахмаленную простыню на город. Невесомые снежинки, вздрагивая от малейшего порыва ветра, искрятся и сверкают миллионами огней в лучах мягкого зимнего солнца, словно драгоценные кристаллы. \n" +
                    "Первый снег — это всегда радость, настоящее преображение природы. Зима вступила в свои права, и это её щедрый подарок. Хлопья снега сыпятся из тяжелых нависших над городом туч и пушистым ковром ложатся на улицы. Воздух свеж и чист. Голые ветки деревьев ранним утром покрывает колючий иней, придавая им причудливую форму. Тонкие заледеневшие иголочки красиво сверкают и переливаются разноцветными огнями. Не деревья в парке, а заколдованный лес! Морозное дыхание зимы рисует на стёклах затейливый орнамент, и окна сразу приобретают сказочный вид.\n" +
                    "Тихо. Всё вокруг замирает. Деревья, тянущие изогнутые ветви к небу, напоминают заснеженных молчаливых истуканов. Но стоит приблизиться, и волшебство исчезает. Такая хрупкая красота! Ажурные снежинки осыпятся от лёгкого прикосновения, оголив тёмные ветки. Но за ночь чародейка-зима всё исправит, чтобы утром все снова смогли насладиться первозданной красотой.\n" +
                    "\n";

            System.out.println(text);

            String[][][] textArray = new String[text.split("\n").length][][];

            String[] paragraphsArray = text.split("\n");

            for (int i = 0; i < paragraphsArray.length; i++) {
                String[] sentencesArray = paragraphsArray[i].split("\\.\\s|\\?\\s|!\\s");
                textArray[i] = new String[sentencesArray.length][];

                for (int j = 0; j < paragraphsArray[i].split("\\.\\s|\\?\\s|!\\s").length; j++) {
                    String[] wordsArray = sentencesArray[j].split("[\\s,—]");
                    textArray[i][j] = new String[wordsArray.length];

                    for (int k = 0; k < sentencesArray[j].split("[\\s,—]").length; k++) {
                        textArray[i][j][k] = wordsArray[k];
                    }
                }
            }

            int point1;
            int point2;

            while (true) {
                System.out.println("\n1)Отсортировать абзацы по количеству предложений.\n2)Отсортировать в каждом предложении слова по длине.\n3)Отсортировать лексемы в предложении " +
                        "по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.\n4)Выход.");

                point1 = in.nextInt();

                switch (point1) {
                    case 1: {
                        System.out.println("1)По возрастанию.\n2)По убыванию.");
                        point2 = in.nextInt();
                        sortParagraphs(textArray, point2 == 1);
                        break;
                    }

                    case 2: {
                        System.out.println("1)По возрастанию.\n2)По убыванию.");
                        point2 = in.nextInt();
                        sortWordsByLength(textArray, point2 == 1);
                        break;
                    }

                    case 3: {
                        System.out.println("Введите символ: ");
                        String str = in.next();
                        sortWordsByNumberOfEntries(textArray, str.charAt(0));
                        break;
                    }

                    case 4: {
                        return;
                    }
                }
            }
        }

        public static void sortParagraphs(String[][][] textArray, boolean flag) {
            int[] sentencesAmountArray = new int[textArray.length];
            int[] indexArray = new int[textArray.length];

            for (int i = 0; i < sentencesAmountArray.length; i++) {
                sentencesAmountArray[i] = textArray[i].length;
                indexArray[i] = i;
            }

            sortArray(sentencesAmountArray, indexArray, flag);

            for (int i = 0; i < textArray.length; i++) {
                for (int j = 0; j < textArray[indexArray[i]].length; j++) {
                    for (int k = 0; k < textArray[indexArray[i]][j].length; k++) {
                        System.out.print(" " + textArray[indexArray[i]][j][k]);
                    }
                }
                System.out.println();
            }
        }

        public static void sortWordsByLength(String[][][] textArray, boolean flag) {
            for (int i = 0; i < textArray.length; i++) {
                for (int j = 0; j < textArray[i].length; j++) {
                    int[] wordsLengthArray = new int[textArray[i][j].length];
                    int[] indexArray = new int[textArray[i][j].length];

                    for (int k = 0; k < textArray[i][j].length; k++) {
                        wordsLengthArray[k] = textArray[i][j][k].length();
                        indexArray[k] = k;
                    }

                    sortArray(wordsLengthArray, indexArray, flag);

                    for (int k = 0; k < textArray[i][j].length; k++) {
                        System.out.print(" " + textArray[i][j][indexArray[k]]);
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
        }

        public static void sortWordsByNumberOfEntries(String[][][] textArray, char character) {
            for (int i = 0; i < textArray.length; i++) {
                for (int j = 0; j < textArray[i].length; j++) {
                    int[] numberOfEntriesArray = new int[textArray[i][j].length];
                    int[] indexArray = new int[textArray[i][j].length];

                    for (int k = 0; k < textArray[i][j].length; k++) {
                        numberOfEntriesArray[k] = numberOfEntries(textArray[i][j][k], character);
                        indexArray[k] = k;
                    }

                    sortNumberOfEntriesArray(numberOfEntriesArray, indexArray, textArray, i, j);

                    for (int k = 0; k < textArray[i][j].length; k++) {
                        System.out.print(" " + textArray[i][j][indexArray[k]]);
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
        }

        public static int numberOfEntries(String textArray, char character) {
            String str = textArray.replaceAll(String.valueOf(character), "");

            return (textArray.length() - str.length());
        }

        public static void sortNumberOfEntriesArray(int[] numberOfEntriesArray, int[] indexArray, String[][][] textArray, int i, int j) {
            boolean flag = true;

            while (flag) {
                flag = false;

                for (int b = 0; b < numberOfEntriesArray.length - 1; b++) {
                    if (numberOfEntriesArray[b] < numberOfEntriesArray[b + 1]) {
                        replace(numberOfEntriesArray, indexArray, b);
                        flag = true;
                    } else {
                        if (numberOfEntriesArray[b] == numberOfEntriesArray[b + 1] && numberOfEntriesArray[b] != 0) {
                            if (textArray[i][j][indexArray[b]].compareToIgnoreCase(textArray[i][j][indexArray[b + 1]]) > 0) {
                                replace(numberOfEntriesArray, indexArray, b);
                                flag = true;
                            }
                        }
                    }
                }
            }
        }

        public static void sortArray(int[] array1, int[] array2, boolean flag) {
            boolean flag1 = true;

            while (flag1) {
                flag1 = false;

                for (int j = 0; j < array1.length - 1; j++) {
                    if (flag) {
                        if (array1[j] > array1[j + 1]) {
                            replace(array1, array2, j);
                            flag1 = true;
                        }
                    } else {
                        if (array1[j] < array1[j + 1]) {
                            replace(array1, array2, j);
                            flag1 = true;
                        }
                    }
                }
            }
        }

        public static void replace(int[] array1, int[] array2, int i) {
            int temp = array1[i];
            array1[i] = array1[i + 1];
            array1[i + 1] = temp;

            temp = array2[i];
            array2[i] = array2[i + 1];
            array2[i + 1] = temp;
        }
    }

}
