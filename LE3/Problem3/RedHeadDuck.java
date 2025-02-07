public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        swimBehavior = new SwimWithWheels();
        flyBehavior = new FlyWithWings(); 
        quackBehavior = new Quack(); 
    }

    @Override
    public void display() {
        System.out.println("I am a RedHead Duck.");
    }
}
