package com.calcengine;

public class Subracter extends CalculateBase {
    public Subracter(){

    }
    public Subracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
