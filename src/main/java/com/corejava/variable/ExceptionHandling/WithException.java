package com.corejava.variable.ExceptionHandling;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class WithException {

        public static void main(String[] args) {
            WithException example = new WithException();
            int output = example.getDivide(10,0);
            log.info("Output:{}", output);
            int output1 = example.getDivide1(10,0);
            log.info("Output1:{}", output1);

        }


        public int getDivide(int inp1, int inp2) {
            int response = 0;
            try {
                response = inp1/inp2;
            } catch (ArithmeticException ex) {
                log.error("Exception", ex);
            }
            log.info("Response:{}", response);
            return response;
        }

        public int getDivide1(int inp1, int inp2) {
            int response1 = inp1/inp2;
            log.info("Response1:{}", response1);
            return response1;
        }
    }

