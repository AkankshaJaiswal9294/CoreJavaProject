package com.corejava.variable.String;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class StringBuilderFunc {
        public StringBuilder PrintStringBuilder(String str1, String str2) {
            StringBuilder builder = new StringBuilder();
            builder.append(str1);
            builder.append(str2);
            return builder;

        }

    public StringBuffer PrintStringBuffer(String str1, String str2) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1);
        buffer.append(str2);
        return buffer;

    }

    public static void main(String[] args) {
        StringBuilderFunc stringBuilderFunc = new StringBuilderFunc();
        Scanner scanner = new Scanner(System.in);
        log.info("Enter input");
        StringBuilder result = stringBuilderFunc.PrintStringBuilder(scanner.next(), scanner.next());
        log.info(result);
        Scanner scanner1 = new Scanner(System.in);
        log.info("Enter input1");
        StringBuffer result1 = stringBuilderFunc.PrintStringBuffer(scanner1.nextLine(), scanner1.nextLine());
        log.info(result1);
        }
}
