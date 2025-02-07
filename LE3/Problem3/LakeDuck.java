public class LakeDuck extends Duck {
    public LakeDuck() {
        swimBehavior = new SwimWithWheels();
        flyBehavior = new FlyWithWings(); 
        quackBehavior = new Quack(); 
    }

    @Override
    public void display() {
        System.out.println("I am a Lake Duck.");
    }
}
