package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class SwitchYield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter input");
        String input = scanner.next();

        SwitchYield switchYield = new SwitchYield();
        String response = switchYield.getLanguage(input);
        log.info("Response:{}", response);

    }
    private static String getLanguage(String language) {
        return switch (language) {  // java 13
            case "ENG":
                yield "English";
            case "SPN":
                yield "Spain";
            default:
                yield "Invalid language";
        };
    }


}
