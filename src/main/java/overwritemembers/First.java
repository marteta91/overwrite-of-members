package overwritemembers;

public class First {
    public static void main (String [] args) {
        Person person = new Person ();
        Dog dog = new Dog();

        person.eat();
        dog.eat();

        }
}
