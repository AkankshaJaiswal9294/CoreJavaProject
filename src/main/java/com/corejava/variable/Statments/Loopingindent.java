package com.corejava.variable.Statments;

import lombok.extern.log4j.Log4j2;

import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;
@Log4j2
public class Loopingindent {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        }
}
