package com.corejava.variable.ExceptionHandling;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
@Log4j2
public class OtherException {

    public static void main(String[] args) {
        OtherException otherException = new OtherException();
//        otherException.readInput();
    }


    public void readInput(String inputFile, String outputFile) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(inputFile);
            fileOutputStream = new FileOutputStream(outputFile);
            int data;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
        } catch (Exception ex) {
            log.error("Exception while reading the data", ex);
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public void readInput1(String inputFile, String outputFile) throws IOException { // try with resource java 7


        try(FileInputStream fileInputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);){

            int data;
            while ((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }

        } catch (Exception ex){
            log.error("Exception while reading the data", ex);
        }
    }


}