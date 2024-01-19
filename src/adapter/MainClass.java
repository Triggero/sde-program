package adapter;

public class MainClass {
    public static void main(String[] args) {
        StringToIntAdapter adapter = new StringToIntAdapter();
        adapter.printNumber(adapter.adapt("123"));
    }
}
