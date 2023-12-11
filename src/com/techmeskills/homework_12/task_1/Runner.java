package com.techmeskills.homework_12.task_1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Abbreviation: ");
        String nameAbbreviation = scanner.nextLine();

        ContainerMethod.findNameAbbreviation(nameAbbreviation);
    }
}
