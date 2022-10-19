package com.spacechallenge;

import com.spacechallenge.dto.Item;

public interface ISpaceShip {

    /**
     * Indicates if the launch was successful or if the rocket has crashed.
     * 
     * @return
     */
    public boolean launch();

    /**
     * Indicates the process of the landing.
     * 
     * @return
     */
    public boolean land();

    /**
     * Indicates if the rocket can carry such item or if it will exceed the weight
     * limit.
     * 
     * @return
     */
    public boolean canCarry(Item item);

    /**
     * takes an Item object and updates the current weight of the rocket.
     */
    public void carry(Item item);
}
