public class Child extends Parent {
    // Inheritance example:
    // Parent has input parameter
    // Child has fixed value

    // Fields
    //int weight;

    Child() {
        super(8);
    }

    public int doubleWeight() {
        return 2 * super.weight;
    }
}
