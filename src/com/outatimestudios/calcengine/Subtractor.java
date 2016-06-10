package com.outatimestudios.calcengine;

/**
 * Created by Jason on 6/10/2016.
 */
public class Subtractor extends CalculateBase {
    public Subtractor() {}
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
