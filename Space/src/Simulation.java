import java.io.*;
import java.util.*;

public class Simulation {

    public ArrayList<Item> loadItems(int phase) throws Exception {

        ArrayList<Item> itemsFromFile = new ArrayList<Item>();

        // open file
        String pathname = "";
        switch (phase) {
            case 1:
                pathname = "phase-1.txt";
                break;
            case 2:
                pathname = "phase-2.txt";
                break;
            default:
                throw new Exception("file not found");
        }

        File file = new File(pathname);
        try {
            Scanner scanner = new Scanner(file);

            // add file lines to array

            while (scanner.hasNextLine()) {
                String itemLine = scanner.nextLine();
                String names[] = itemLine.split("=");
                String name = names[0]; // 004
                int weight = Integer.parseInt(names[1]);
                Item item = new Item(name, weight);
                itemsFromFile.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return itemsFromFile;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

        ArrayList<Rocket> u1RocketsReady = new ArrayList<>();

        Rocket u1Rocket = new U1();

        for (Item item : items) {
            if (!u1Rocket.canCarry(item)) {
                u1RocketsReady.add(u1Rocket);
                u1Rocket = new U1();
            }

            if (u1Rocket.canCarry(item)) {
                u1Rocket.carry(item);
            }

        }
        u1RocketsReady.add(u1Rocket);
        System.out.println("u1 rockets ready: " + u1RocketsReady.size());

        return u1RocketsReady;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

        ArrayList<Rocket> u2RocketsReady = new ArrayList<>();

        Rocket u2Rocket = new U2();

        for (Item item : items) {
            if (!u2Rocket.canCarry(item)) {
                u2RocketsReady.add(u2Rocket);
                u2Rocket = new U2();
            }
            if (u2Rocket.canCarry(item)) {
                u2Rocket.carry(item);
            }
        }
        u2RocketsReady.add(u2Rocket);

        System.out.println("u2 rockets ready: " + u2RocketsReady.size());
        return u2RocketsReady;
    }

    public int runSimulation(ArrayList<Rocket> u2RocketsReady) {

        int totalBudget = 0;

        for (Rocket rocket : u2RocketsReady) {
            while (!rocket.launch() && !rocket.land()) {
                totalBudget += rocket.costInMln;
            }
            totalBudget += rocket.costInMln;
        }

        System.out.println("Total budget: " + totalBudget);
        return totalBudget;
    }
}
