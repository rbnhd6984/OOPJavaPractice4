package practice4;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5, 6, 7);
        System.out.println("calculator.sum() = " + calculator.sum());
        System.out.println("calculator.multiply() = " + calculator.multiply());
        System.out.println("calculator.division(a, b) = " + calculator.division(5, 5));
        System.out.println("calculator.intToBin(integer) = " + calculator.intToBin(6));
        System.out.println("calculator.binToDec(binStr) = " + calculator.binToDec("11111"));
        System.out.println("calculator.doubleToBin(double) = " + calculator.doubleToBin(3.23));
    }
}
