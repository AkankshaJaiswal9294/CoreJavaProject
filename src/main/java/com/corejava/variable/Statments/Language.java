package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Language {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the Language:");
        String input = scanner.next();

        Language language = new Language();
        String response = language.getLanguage(input);
        log.info("Response:{}", response);
    }

    public String getLanguage(String language) {
        if (language.equals("ENG")) {
            return "ENGLISH";
        } else if (language.equals("SPN")) {
            return "SPANISH";
        }
        return "NOT VALID LANGUAGE";
    }
}

