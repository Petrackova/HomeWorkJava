package homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**1)Пусть дан LinkedList с несколькими элементами.
 *  Реализуйте метод, который вернет “перевернутый” список.**/
public class ReverseLinkedList {
    private static LinkedList <Integer> arrList = new LinkedList<>();
    public void reversArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int sizeArray = in.nextInt();
        System.out.println("Введите максимальное число для списка: ");
        int maxRand = 10000;
        int minRand = -10000;
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            arrList.add(random.nextInt((int) (Math.random() * (maxRand - minRand + 1))) + minRand);
        }
        System.out.println("Список имеет вид: ");
        System.out.println(arrList);
        Collections.reverse(arrList);
        System.out.println("Обратный список: ");
        System.out.println(arrList);
    }

}
