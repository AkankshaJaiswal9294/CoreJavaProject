package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class LoopFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter input");
        int input = scanner.nextInt();
        LoopFor loopFor = new LoopFor();
        loopFor.getNumber(input);
        Scanner scanner1 = new Scanner(System.in);
        log.info("Enter input2");
        int input1 = scanner1.nextInt();
        loopFor.getNumber1(input1);
    }

    public void getNumber(int n) {
        for (int i=0; i<=n; i++) {
            log.info("I :"+i);
        }
    }
    public void getNumber1(int n) {
        for (int j=n; j>=0; j--) {
            log.info("j :"+j);
        }
    }

}
