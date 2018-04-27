
# Example Java code

## Inheritance: Parent with parameter input which is fixed for the child class.
The question is, how to create the child constructor?

Basically, for the child constructor you can set the parent parameter using `super(param_value)`

See the constructor in `src/Child` and how it us used in `src/main`.

```java
        Parent parent = new Parent(7);
        System.out.println(parent.getWeight());

        Child child = new Child();
        System.out.println(child.getWeight());
```