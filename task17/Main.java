package com.kraaken.project.patternmatcher.task17;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

                String str = "<notes> \n" +
                        "   <note id = \"1\"> \n" +
                        "       <to>Вася</to> \n" +
                        "       <from>Света</from> \n" +
                        "       <heading>Напоминание</heading> \n" +
                        "       <body>Позвони мне завтра!</body> \n" +
                        "   </note> \n" +
                        "   <note id = \"2\"> \n" +
                        "       <to>Петя</to> \n" +
                        "       <from>Маша</from> \n" +
                        "       <heading>Важное напоминание</heading> \n" +
                        "       <body/> \n" +
                        "   </note> \n" +
                        "</notes>";

                String regex = "(<[a-z]+>|<[a-z]+.id.+>)|(</[a-z]+>)|([А-Я].+[а-я][!]?)|(<[a-z]+/)";


                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(str);

                while (matcher.find()) {
                    if (matcher.group(1) != null) {
                        System.out.println(matcher.group(1) + " - Open tag.");
                    } else {
                        if (matcher.group(2) != null) {
                            System.out.println(matcher.group(2) + " - Close tag.");
                        } else {
                            if (matcher.group(3) != null) {
                                System.out.println(matcher.group(3) + " - Content tag.");
                            } else {
                                if (matcher.group(4) != null) {
                                    System.out.println(matcher.group(4) + " - Tag without body.");
                                }
                            }
                        }
                    }
                }
            }
        }



