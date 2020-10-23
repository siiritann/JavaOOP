public interface SpaceShip {
    boolean launch(); // returns either true if launch was successful or false if rocket has crashed
    boolean land(); //  returns either true or false based on the success of the landing
    boolean canCarry(Item item); // returns true if the rocket can carry such item or false if it will exceed the weight
    // limit
    void carry(Item item); // updates the current weight of the rocket
}
