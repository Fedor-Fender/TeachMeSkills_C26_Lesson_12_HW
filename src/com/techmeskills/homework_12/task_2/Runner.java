package com.techmeskills.homework_12.task_2;
/**
 * Задача *:
 * Программа на вход получает произвольный текст. В этом тексте может быть номер
 * документа(один или несколько), емейл и номер телефона. Номер документа в формате:
 * xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
 * может содержать не всю информацию, т.е. например, может не содержать номер
 * телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
 * формате:
 * email: teachmeskills@gmail.com
 * document number: 1423-1512-51
 * и т.д
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static final String PHONE_REGEX = "(\\+\\([0-9]{2}\\)[0-9]{7})";
    public static final String DOCUMENT_REGEX = "[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{2}";
    public static final String EMAIL_REGEX = "\\b[0-9A-Za-z.-_]+@[0-9A-Za-z].[A-Za-z]{3}\\b";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String informationClient = scanner.nextLine();

        Pattern pattern1 = Pattern.compile(DOCUMENT_REGEX);
        Matcher matcherDocument = pattern1.matcher(informationClient);

        Pattern patternPhone = Pattern.compile(PHONE_REGEX);
        Matcher matcherPhone = patternPhone.matcher(informationClient);

        Pattern patternEmail = Pattern.compile(EMAIL_REGEX);
        Matcher matcherEmail = patternEmail.matcher(informationClient);

        if (matcherDocument.find()) {
            System.out.println("Document of user-> " + matcherDocument.group() + "\n");
        } else {
            System.out.println("It's wrong document");
            if (matcherPhone.find()) {
                System.out.println("Phone of user-> " + matcherPhone.group());
            } else {
                System.out.println("It's wrong phone");
            }
            if (matcherEmail.find()) {
                System.out.println("User e-mail->" + matcherEmail.group());
            } else {
                System.out.println("It's wrong email");
            }
        }
    }
}
