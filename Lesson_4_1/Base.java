package Lesson_4_1;

import java.util.Random;

public class Base {
    public static void main(String[] args) {
        int[] array = new int[20]; //инициализируем массив и задаём его размер
        Random random = new Random();
        //заполнение массива случайными числами от -10 до 10
        for (int i = 0; i < 20; i++) {
            array[i] = (random.nextInt(21) - 10);
            System.out.println(array[i]);
        }
        //поиск максимального отрицательного и минимального положительного элемента массива
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (array[i] < array[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
        //меняем минимальное и максимальное значение местами в массиве
        swapElements(array, indexOfMax, indexOfMin);
        for (int i = 0; i < 20; i++) {
            System.out.println(array[i]);
        }
    }
    private static void swapElements(int[] array, int i, int j)
    {
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
