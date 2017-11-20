package com.samLorimer;

public class Main {

    public static void main(String[] args) {

    byte myByteValue = 10;
    short myShortValue = 20;
    int myIntValue = 50;
    long ourLongTotal = 50_000L + 10L * (myByteValue + myShortValue + myIntValue);
    short ourShortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));
        System.out.println("Long total = " + ourLongTotal);
        System.out.println("Short total = " + ourShortTotal);
    }
}
