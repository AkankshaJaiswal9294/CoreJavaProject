package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrimitiveDataType {
    private byte input1;
    private short input2;
    private int input3;
    private long input4;
    private float input5;
    private double input6;
    private boolean input7;
    private char input8;

    public PrimitiveDataType(byte input1, short input2, int input3, long input4, float input5, double input6, boolean input7, char input8) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
        this.input6 = input6;
        this.input7 = input7;
        this.input8 = input8;
    }

    public void print() {
        log.info("input1:{}, input2:{}, input3:{}, input4:{}, input5:{}, input6:{}, input7:{}, input8:{}",input1, input2, input3, input4, input5, input6, input7, input8);
    }

    public static void main(String[] args) {
        PrimitiveDataType primitiveDataType = new PrimitiveDataType((byte)12, (short)45, 1000, 10000000l, 10.12f, 10000.99, true, 'A' );
        primitiveDataType.print();
    }
}
