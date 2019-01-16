package com.drelang.proxy;

public class Proxy implements IGiveGift {
    private Pursuit pursuit;

    public Proxy(SchoolGirl mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }
}
