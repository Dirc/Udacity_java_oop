public class Main {

    public static void main(String[] args) {

        // TESTS
        // Item
        Item item1 = new Item("fuel", 10);
        System.out.println(item1.getWeight());
        // Spaceship
        SpaceShip testship = new SpaceShip(100);
        System.out.println("Can carry:" + testship.canCarry(item1));
        testship.carry(item1);
        Item item2 = new Item("apples", 101);
        System.out.println("Can carry:" + testship.canCarry(item2));
        testship.carry(item2);
        testship.carry(item1);
        testship.getBag();

    }
}
