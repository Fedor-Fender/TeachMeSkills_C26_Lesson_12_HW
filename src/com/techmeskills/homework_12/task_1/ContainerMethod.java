package com.techmeskills.homework_12.task_1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainerMethod {

    public static final String REGEX = "[A-Z]{2,6}";
    public static void findNameAbbreviation(String nameAbbreviation) {

        String[] str = nameAbbreviation.split("\\s");

        Pattern pattern = Pattern.compile(REGEX);

        for (String string:str){
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
                System.out.println("Find abbreviation:"+matcher.group());
            }
        }
    }
}
