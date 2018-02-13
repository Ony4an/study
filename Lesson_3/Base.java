package Lesson_3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Base {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        String operation = br.readLine();
        if (operation.equals("1")) {
            Calculator calculator = new Calculator();
            calculator.calc();
        }
        if (operation.equals("2")) {
            WordsArray wordsArray = new WordsArray();
            wordsArray.searchWord();
    }

}
}
