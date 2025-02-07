public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display(); 
        
        // Uncommenting the below code will result in error because AbsTest cannot be instantiated
        // AbsTest absTest = new AbsTest(); // Error: AbsTest is abstract and cannot be instantiated
    }
}
