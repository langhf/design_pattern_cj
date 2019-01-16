package com.drelang.simpleFactory;

public class OperationDiv extends Operation {
    @Override
    public Double getResult() throws ArithmeticException {
        return this.getNumberA() / this.getNumberB();
    }
}
