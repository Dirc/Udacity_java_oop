import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    // Fields
    //public ArrayList<Item> listOfItems;
    //public ArrayList<Item> listOfItemsU1;
    public ArrayList<U1> listOfRocketsU1;
    public ArrayList<U2> listOfRocketsU2;

    // Constructor
    public Simulation(){
        //this.listOfItems     = new ArrayList<Item>();

        this.listOfRocketsU1 = new ArrayList<U1>();
        this.listOfRocketsU2 = new ArrayList<U2>();
    }

    // Methods
    // Can this made private? Looks like just a helper function..
    public ArrayList<Item> loadItems(String filePath) throws Exception {
        ArrayList<Item> listOfItems = new ArrayList<Item>();
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
            listOfItems.add(item);
        }
        return listOfItems;
    }

    public ArrayList<U1> loadU1() throws Exception {
        ArrayList<Item> listOfItemsU1 = this.loadItems("/home/cornet/code/prive/Udacity_java_oop/SpaceChallenge/src/Phase-1.txt");

        while (listOfItemsU1.size() > 0) {
            // Create new Rockt U1
            U1 u1 = new U1();
            this.listOfRocketsU1.add(u1);

            // Fill rocket
            while (u1.canCarry(listOfItemsU1.get(0))) {
                u1.carry(listOfItemsU1.get(0));
                listOfItemsU1.remove(0);
            }
        }



        return this.listOfRocketsU1;
    }

}

