package Lesson_6;

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Base {
    String line;
    ArrayList<User> mass = new ArrayList<User>();


    public void reader() {
        BufferedReader readFromFile = null;
        try {
            readFromFile = new BufferedReader(new FileReader("C:/text.txt"));
            while ((line = readFromFile.readLine()) != null) {
                User newUser = new User();
                newUser.key = line;
                mass.add(newUser);
                Collections.sort(mass);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (readFromFile != null)
                try {
                    readFromFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public class User {
        public String key;
    }

    public static void main(String[] args) throws IOException {
        Base test = new Base();
        test.reader();
        for (User newUser : test.mass)
            System.out.println(newUser.key);
    }
}

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Base {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("C:/text.txt")); //считываем текст из файла
        ArrayList<String> list = new ArrayList<String>();
        //добавляем информацию из файла в массив
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();

        Collections.sort(list); //сортируем слова по порядку
        //выводим отсортированные слова на консоль
        System.out.println("Sorted words: ");
        for (String i : list) {
            System.out.println(i);
        }

        // считаем сколько раз каждое слово встречается в тексте и выводим результат на консоль
        System.out.println("\nCount all with frequency");
        Set<String> uniqueSet = new HashSet<String>(list);
        String wordMax = null;
        Integer countMax = 0;

        for (String temp : uniqueSet) {
            System.out.println(temp + ": " + Collections.frequency(list, temp));
            //ищем слово, которое встречается чаще всего
            if (Collections.frequency(list, temp) > countMax) {
                countMax = Collections.frequency(list, temp);
                wordMax = temp;
            }
        }

        System.out.println("\nMax frequent word is " + wordMax + ": " + countMax);
    }
}
