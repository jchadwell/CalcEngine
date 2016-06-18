package com.outatimestudios.calcengine;

/**
 * Created by Jason on 6/17/2016.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);
}
