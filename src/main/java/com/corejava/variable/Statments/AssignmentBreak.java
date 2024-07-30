package com.corejava.variable.Statments;

public class AssignmentBreak {
    public static void main(String[] args) {

        AssignmentBreak assignmentBreak1 = new AssignmentBreak();
        assignmentBreak1.getBreak();
        assignmentBreak1.getContinue();
        assignmentBreak1.getContinue1();
        assignmentBreak1.getBreak1();

    }

    public void getContinue() {
        int num = 5;
        System.out.println();
        for (int i = 1; i <= num; i++) {
            if (i == 3)
                continue;
            System.out.print(i);
        }
    }

    public void getBreak() {
        int num2 = 5;
        for (int i = 1; i <= num2; i++) {
            if (i == 3)
                break;
            System.out.print(i);
        }
    }

    public void getContinue1() {
        int n = 5;
        outer:
        for (int i = 1; i <= n; i++) {
            inner:
            for (int j = 1; j <= n; j++) {
                if (j % 3 == 0)
                    continue inner;
                System.out.println(j);
            }
            System.out.println();
        }
    }

    public void getBreak1() {
        int n = 5;
        outer:
        for (int i = 1; i <= n; i++) {
            inner:
            for (int j = 1; j <= n; j++) {
                if (j % 3 == 0)
                    break inner;
                System.out.println(j);
            }
            System.out.println();
        }
    }
}