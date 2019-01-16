package com.drelang.simpleFactory;

public class OperationAdd extends Operation {
    @Override
    public Double getResult() {
        Double result = 0.00;
        result = this.getNumberA() + this.getNumberB();
        return result;
    }
}
