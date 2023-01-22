package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("If both tests pass, the singleton class is working correctly." + "\n\n" + "Test:" + "\n");
        Singleton first = Singleton.getInstance("Pass");
        Singleton second = Singleton.getInstance("Fail");
        System.out.println(first.value);
        System.out.println(second.value);
    }
}