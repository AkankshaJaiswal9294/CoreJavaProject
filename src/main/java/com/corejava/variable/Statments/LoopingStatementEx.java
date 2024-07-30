package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

public class LoopingStatementEx {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}