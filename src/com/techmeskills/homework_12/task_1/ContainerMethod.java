package com.techmeskills.homework_12.task_1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainerMethod {

    public static final String REGEX = "[A-Z]{2,6}";
    public static void findNameAbbreviation(String nameAbbreviation) {

        String[] str = nameAbbreviation.split("\\s");

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(str);// подчеркивает str красным?
        while (matcher.find()) { // правильный ли здесь цикл
            String match = matcher.group();
            System.out.println("Find abbreviation:"+match);
        }
    }
}
