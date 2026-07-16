/*Create a base class Fruit with name ,taste and size as its attributes.Create a method called eat() which describes the name of the fruit and its taste.Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.*/
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + " which is " + taste + " in taste.");
    }
}

class Apple extends Fruit {
    public Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("Eating a crunchy " + size + " Apple. It tastes delightfully " + taste + "!");
    }
}

class Orange extends Fruit {
    public Orange(String size) {
        super("Orange", "sour-sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("Eating a juicy " + size + " Orange. It has a refreshing " + taste + " taste!");
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("Generic Fruit", "sweet", "medium");
        genericFruit.eat();

        System.out.println();

        Apple apple = new Apple("large");
        apple.eat();

        System.out.println();

        Orange orange = new Orange("small");
        orange.eat();
    }
}