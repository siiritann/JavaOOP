public class U2 extends Rocket {

    U2() {
        currentWeight = 18000;
        maxWeight = 29000;
        costInMln = 120;
    }

    public boolean launch() {
        double probabilityOfExplosion = 0.04 * (currentWeight / (double) maxWeight);
        double random = (Math.random());
        return (random > probabilityOfExplosion);
    }

    public boolean land() {
        double probabilityOfExplosion = 0.08 * (currentWeight / (double) maxWeight);
        double random = (Math.random());
        return (random > probabilityOfExplosion);
    }
}
