package com.spacechallenge;

import com.spacechallenge.dto.Item;

public class Rocket implements ISpaceShip {

    @Override
    public boolean launch() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean land() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void carry(Item item) {
        // TODO Auto-generated method stub

    }

}
