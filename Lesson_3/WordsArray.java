package Lesson_3;

import java.io.IOException;
import java.util.Scanner;

public class WordsArray {
    public void searchWord() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество слов в массиве");
        int size = input.nextInt(); //задаем размер массива
        String[] wordsArray = new String[size];

        for (int i = 0; i < size; i++ ) { //заполняем массив словами с клавиатуры
            System.out.println("Введите слово");
            wordsArray[i] = input.nextLine();
            }

        int maxLength = 0;
        for(String s : wordsArray) {
            if(s.length() > maxLength) maxLength = s.length();
        }
        System.out.println("Самое длинное слово:");
        for(String s: wordsArray) {
            if(s.length() == maxLength) System.out.println(s);
        }
    }
}
