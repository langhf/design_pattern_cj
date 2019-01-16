package com.drelang.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pursuit implements IGiveGift {
    private static final Logger LOGGER = LoggerFactory.getLogger(Pursuit.class);
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }


    @Override
    public void GiveDolls() {
        LOGGER.info(mm.getName() + " 送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        LOGGER.info(mm.getName() + " 送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        LOGGER.info(mm.getName() + " 送你巧克力");
    }
}
