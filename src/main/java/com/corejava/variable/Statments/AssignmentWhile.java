package com.corejava.variable.Statments;

public class AssignmentWhile {
    public static void main(String[] args) {

        AssignmentWhile assignmentWhile = new AssignmentWhile();
        assignmentWhile.getUsingWhile();
        assignmentWhile.getUsingDoWhile();
    }

    public void getUsingWhile() {
        int number = 6;
        while (number <= 5) {
            System.out.println("This is "+number+" for while loop");
            number++;
        }

    }
    public void getUsingDoWhile() {
        int number = 6;
        do {
            System.out.println("This is "+number+" for do while loop");
            number++;
        } while (number<=5);
    }
}
