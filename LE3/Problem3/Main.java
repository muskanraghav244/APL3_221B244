public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performSwim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performSwim();
        woodenDuck.performFly();
        woodenDuck.performQuack();

        System.out.println();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performSwim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.display();
        lakeDuck.performSwim();
        lakeDuck.performFly();
        lakeDuck.performQuack();
    }
}
