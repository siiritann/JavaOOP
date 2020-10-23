public abstract class Rocket implements SpaceShip {

    int currentWeight = 0;
    int maxWeight = 0;
    int costInMln = 0;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return (maxWeight - currentWeight >= item.weight);
    }

    public void carry(Item item) {
        currentWeight += item.weight;
    }

}
