public class U1 extends Rocket {

    U1() {
        currentWeight = 10000;
        maxWeight = 18000;
        costInMln = 100;
    }

    public boolean launch() {
        double probabilityOfExplosion = 0.05 * (currentWeight / (double) maxWeight);
        double random = Math.random(); // 0.0 .. 0.99
        return (random > probabilityOfExplosion);
    }

    public boolean land() {
        double probabilityOfExplosion = 0.01 * (currentWeight / (double) maxWeight);
        double random = Math.random(); // 0.0 .. 0.99
        return (random > probabilityOfExplosion);
    }

}
