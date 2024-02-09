package practice4;

import java.util.Arrays;
import java.util.List;
public class Calculator {
    private List<Number> array;

    public <T extends  Number> Calculator(T... array) {
        this.array = Arrays.asList(array);
    }

    public Calculator() {
    }

    public double sum () {
        double result = 0;
        for (Number number : array) {
            result += number.doubleValue();
        }
        return result;
    }

    public double multiply () {
        double result = 1;
        for (Number number : array) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double division (double a, double b) {
        if (b == 0) {
            System.err.println("Ошибка: деление на ноль недопустимо.");
            return Double.NaN;
        }
        return a / b;
    }

    public String intToBin(int number) {
        StringBuilder result = new StringBuilder();
        int temp = 0;
        while (number >= 1) {
            temp = number % 2;
            result.insert(0, temp);
            number /= 2;
        }
        return result.toString();
    }

    public int binToDec(String binStr) {
        int number = 0;
        int length = binStr.length();
        for (int i = 0; i < binStr.length(); i++) {
            char c = binStr.charAt(i);
            int bit = Character.getNumericValue(c);
            int exponent = length - 1 - i;
            number += bit * Math.pow(2, exponent);
        }
        return number;
    }

    public String doubleToBin(double number) {
        int dec = (int) number;
        double fractional = number - dec;
        StringBuilder result = new StringBuilder();
        while (dec > 0) {
            result.append(dec % 2);
            dec /= 2;
        }
        result.reverse();

        if (fractional != 0) {
            result.append(".");
            while (fractional > 0) {
                fractional *= 2;
                if (fractional >= 1) {
                    result.append(1);
                    fractional -= 1;
                }
                else result.append(0);
            }
        }
        return result.toString();
    }
}
