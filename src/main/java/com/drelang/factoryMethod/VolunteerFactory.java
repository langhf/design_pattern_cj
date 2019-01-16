package com.drelang.factoryMethod;

public class VolunteerFactory implements LeiFengFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
