import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    // Fields
    private SpaceShip spaceShip;

    // Constructor
    public Simulation(SpaceShip spaceShip){
        this.spaceShip = spaceShip;
    }
    // Methods
    public ArrayList<Item> loadItems(String filePath) throws Exception {
        // read file
        // for each line: name, weight
        // Create Item
        // for each item
        //spaceship.carry(Item item);
        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String name = line.split("=")[0];
            int weight;
            weight = Integer.parseInt(line.split("=")[1]);
            Item item = new Item(name, weight);
            spaceShip.carry(item);
        }
        return spaceShip.getBag();

    }

}

