package com.drelang.simpleFactory;

public class OperationMul extends Operation {
    @Override
    public Double getResult() {
        return this.getNumberA() * this.getNumberB();
    }
}
