package overwritemembers;

public class Person  extends Animal{
    @Override
    public void eat() {
        System.out.println(" I stay eat and cutlery");
    }
}
