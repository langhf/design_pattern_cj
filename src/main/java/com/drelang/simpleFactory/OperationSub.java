package com.drelang.simpleFactory;

public class OperationSub extends Operation {
    @Override
    public Double getResult() {
        return this.getNumberA() - this.getNumberB();
    }
}
