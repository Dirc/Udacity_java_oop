public class Main {
    public static void main(String []args) {
        System.out.println("---Start---");

        Parent parent = new Parent(7);
        System.out.println(parent.getWeight());

        Child child = new Child();
        System.out.println(child.getWeight());
        System.out.println(child.doubleWeight());
        System.out.println(child.weight);
    }
}
