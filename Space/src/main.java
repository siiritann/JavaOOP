public class main {
    public static void main(String[] args) {

        Simulation s = new Simulation();

        try {
        s.runSimulation(s.loadU1(s.loadItems(1)));
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }
}
