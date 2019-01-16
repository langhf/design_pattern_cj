package com.drelang.simpleFactory;

import lombok.Data;

@Data
public class Operation {
    private Double numberA = 0.00;
    private Double numberB = 0.00;

    public Double getResult() {
        Double result = 0.00;
        return result;
    }
}
