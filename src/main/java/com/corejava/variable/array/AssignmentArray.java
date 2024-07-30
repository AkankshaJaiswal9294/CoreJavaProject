package com.corejava.variable.array;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

public class AssignmentArray {
    public static void main(String[] args) {
        AssignmentArray assignmentArray = new AssignmentArray();
//        assignmentArray.getOneDArray1();
//        assignmentArray.getOneDArray2();
//        assignmentArray.getTwoDArray1();
        assignmentArray.getTwoDArray2();
    }

    public void getOneDArray1() {
        String[] city = new String[4];
        city[0] = "chennai";
        city[1] = "bangalore";
        city[2] = "ranchi";
        city[3] = "pune";
        for (int i = 0; i< city.length; i++) {
            System.out.println(city[i]);
        }
    }
    public void getOneDArray2() {
        String[] city = {"Chennai","Bangalore","Ranchi","pune"};
        for (int i = 0; i< city.length; i++) {
            System.out.println(city[i]);
        }
    }
    public void getTwoDArray1() {
        String[][] city = {{"Delhi","Mumbai","Chennai"},{"Bangalore","Kolkata","Ranchi"}};
        for (int i = 0; i< city.length; i++) {
            for(int j = 0; j< city.length; j++){
                System.out.println(city[i][j]);
            }
        }
    }
    public void getTwoDArray2() {
        String[][] city = new String[2][3];
        city[0][0] = "Delhi";
        city[0][1] = "Mumbai";
        city[0][2] = "Chennai";
        city[1][0] = "Bengaluru";
        city[1][1] = "Kolkata";
        city[1][2] = "Ranchi";
        for (int i = 0; i< city.length; i++) {
            for(int j = 0; j< city.length; j++){
                System.out.println(city[i][j]);
            }
        }
    }
}
