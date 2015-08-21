package LinkedList;

/**
 * Created by nithyapari on 8/11/15.
 */
public class TestDog {

    public static void main(String args[]) {
        Dog dog1 = new Dog("Ricky", 2, "Mongrel");
        Dog dog2 = new Dog("Max", 3, "german shepherd");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        String firstDog = dog1.toString();
        Dog dog3 = Dog.createDogFromString(firstDog);
        System.out.println(dog3.toString());
        System.out.println(dog1.equals(dog3));
        System.out.println(dog1.hashCode());
        System.out.println(dog3.hashCode());
    }
}
