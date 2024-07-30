package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class SwitchLambda {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            log.info("Enter input");
            String input = scanner.next();

            SwitchLambda switchLambda = new SwitchLambda();
            String response = switchLambda.getLanguage(input);
            log.info("Response:{}", response);

        }
        public String getLanguage(String language){
            String response = null;

            response = switch (response){
                case "ENG"->
                        "English";
                case "SPN" ->
                        "Spain";
                default->
                        "Invalid language";
            };


            return response;
        }


}
