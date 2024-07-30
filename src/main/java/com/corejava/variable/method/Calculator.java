package com.corejava.variable.method;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Calculator {
    public long Multiplication(long input1, long input2) {
//         Instance method
        long result = input1 * input2;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter inp");

        Calculator calculator = new Calculator();
        long response = calculator.Multiplication(scanner.nextLong(),scanner.nextLong());
        log.info(response);
    }
}
