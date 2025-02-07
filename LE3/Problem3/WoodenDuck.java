public class WoodenDuck extends Duck {
    public WoodenDuck() {
        swimBehavior = new SwimWithWheels();
        flyBehavior = new FlyNoWay(); 
        quackBehavior = new Mute(); 
    }

    @Override
    public void display() {
        System.out.println("I am a Wooden Duck.");
    }
}
