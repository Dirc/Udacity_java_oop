public class Item {
    // Fields:
    private String name;
    private int weight;

    // Constructor
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Methods:
    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
