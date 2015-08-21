package LinkedList;

/**
 * Created by nithyapari on 8/11/15.
 */
public class Dog {

    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + breed;
    }

    @Override
    public boolean equals(Object obj) {
        Dog otherDog = (Dog) obj;
        return (this.name.equalsIgnoreCase(otherDog.name)) && (this.age == otherDog.age) && (this.breed.equalsIgnoreCase(otherDog.breed));
    }

    public static Dog createDogFromString(String value) {
        String [] values = value.split(",");
        Dog dog = new Dog(values[0], Integer.parseInt(values[1]), values[2]);
        return dog;
    }
}
