package com.corejava.variable.Statments;

public class StringReversal {

    public static void main(String[] args) {
        StringReversal stringReversal = new StringReversal();
        System.out.println(stringReversal.reverseString("this is pgm for string reversal"));
    }
    public static String reverseString(String str){
        char[] ch = str.toCharArray();
        String reverse = " ";
        for( int i = ch.length-1 ; i>=0 ; i--){
            reverse += ch[i];
        }
        return reverse;
    }
}
