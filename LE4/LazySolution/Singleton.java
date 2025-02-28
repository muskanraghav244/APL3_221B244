public class Singleton {
    private static Singleton uniqueInstance;
    int count = 0;
    private Singleton() {
        count++;
    }
    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
    public int getCount() {
        return count;
    }
}