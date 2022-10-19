package com;

/**
 * The mission is to send a list of items (Habitats, bunkers, food supplies, and
 * rovers) to Mars, but we need to run some simulations first to pick the
 * correct fleet of rockets.
 * 
 * U-1
 * The U-1 Rocket is light weight, agile and pretty safe, but can only carry a
 * total of 18 tonnes of cargo. It costs $100 Million to build and weighs 10
 * tonnes. It has a slim chance of crashing while landing but a bigger chance of
 * exploding when launching, both chances depend on the amount of cargo carried
 * in the rocket.
 * 
 * U-2
 * The U2 Rocket heavier than the U-1 but much safer and can carry a lot more
 * cargo; to a total of 29 tonnes. However, it costs $120 Million to build and
 * weighs 18 tonnes. It has a greater chance of crashing while landing than
 * while launching, but just like the U-1 both chances depend on the amount of
 * cargo carried.
 * 
 * The Mission
 * The mission consists of 2 phases:
 * 
 * Phase-1:
 * This phase is meant to send building equipment and construction material to
 * help build the colony. In the resources tab, you will find a text file that
 * contains the list of all items that we need to send called 'Phase-1.txt`.
 * Each line in the file contains the item name as well as its weight in Kgs.
 * 
 * Phase-2:
 * This phase is meant to send the colony of humans along with some food
 * resources. In the resources tab, you will find a text file that contains the
 * list of all items that we need to send called 'Phase-2.txt`. Each line in the
 * file also contains the item name and its weight in Kgs.
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mission to mars!");
    }
}
