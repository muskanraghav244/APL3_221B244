public class Main
{
	public static void main(String[] args) {
		System.out.println("Lazy Solution");
		Singleton singleton1 = Singleton.getInstance();
        System.out.println("Count after first instance: " + singleton1.getCount());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Count after second instance: " + singleton2.getCount());
	}
}