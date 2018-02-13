package Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public void calc() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        System.out.println("Введите первое число");
        String text1 = br.readLine();
        double firstNumber = Double.parseDouble(text1);
        System.out.println("Введите второе число");
        String text2 = br.readLine();
        double secondNumber = Double.parseDouble(text2);
        System.out.println("Какую операцию выполнить? Введите + - / *");
        String operation = br.readLine();
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        System.out.print("Результат:");
        System.out.printf("%.4f", result);
           }
}
