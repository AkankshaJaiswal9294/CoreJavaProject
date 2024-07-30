package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class SwitchDefault {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter input");
        String input = scanner.next();

        SwitchDefault switchDefault = new SwitchDefault();
        String response = switchDefault.getLanguage(input);
        log.info("Response:{}", response);

    }
    public String getLanguage(String language){
        String response = null;

        switch (language){
            case "ENG":
                response = "English";
                break;
            case "SPN":
                response = "Spain";
                break;
            default:
                response = "Invalid language";
        }

        return response;
    }

}
