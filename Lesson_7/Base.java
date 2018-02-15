package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое число");
            String fnum = br.readLine();
            double firstNumber = Double.parseDouble(fnum);
            System.out.println("Введите второе число");
            String snum = br.readLine();
            double secondNumber = Double.parseDouble(snum);
            System.out.println("Какую операцию выполнить? Введите + - / *");
            String operationChoose = br.readLine();

            Operation operation = new Operation();

            if (operationChoose.equals("+")) {
                operation.addition(firstNumber, secondNumber);
            }
            if (operationChoose.equals("-")) {
                operation.subtraction(firstNumber, secondNumber);
            }
            if (operationChoose.equals("/")) {
                operation.division(firstNumber, secondNumber);
            }
            if (operationChoose.equals("*")) {
                operation.multiplication(firstNumber, secondNumber);
            }

            System.out.println(operation.getAnswer());

        } catch (Exception ex) {
            System.out.println("Error: " + ex); // обработка прочих исключений (например ввод букв)
        }

    }

}
