public class main {
    public static void main(String[] args) {

        Simulation s = new Simulation();

        try {
        s.runSimulation(s.loadU2(s.loadItems(2)));
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }
}
