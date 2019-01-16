package com.drelang.factoryMethod;

public class UndergraduateFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
