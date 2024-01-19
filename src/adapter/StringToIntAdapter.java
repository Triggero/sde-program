package adapter;

class StringToIntAdapter implements IntegerPrinter {
    @Override
    public void printNumber(int number) {
        System.out.println("Printing integer (converted from String): " + number);
    }

    public int adapt(String inputString) {
        return Integer.parseInt(inputString);
    }
}