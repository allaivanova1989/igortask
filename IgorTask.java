import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class IgorTask {
    public static void main(String[] args) {
        int numbers [] = new int[10];
        System.out.println("Изначальный массив");
        for (int i = 0; i < 10; i++) {
            int a = 1; // Начальное значение диапазона - "от"
            int b = 50; // Конечное значение диапазона - "до"
            numbers[i] = a + (int) (Math.random() * b);
            System.out.print(" ");
            System.out.print(numbers[i]);
        }
        String intNumbersString = Arrays.toString(numbers);
        System.out.println(" ");
        System.out.println("Массив из индексов четных значений");
        int indexes [] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                indexes[i] = i;
                System.out.print(" ");
                System.out.print(indexes[i]);
            } else {
                System.out.print("");
            }
        }
        String intIndexesString = Arrays.toString(indexes);
        System.out.println("");

        System.out.print(intNumbersString);
        System.out.print(intIndexesString);


    }

}






