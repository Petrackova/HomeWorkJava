package homework3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class MinMaxArray {
    public void ArrayFunction() {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int sizeArray = in.nextInt();
        System.out.println("Введите максимальное число для списка: ");
        int arrayMax = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array.add(random.nextInt(arrayMax+1));
        }
        System.out.println("Список имеет вид: ");
        System.out.println(array);
        System.out.println("Максимальный элемент в списке: " + Collections.max(array));
        System.out.println("Минимальный элемент в списке: " + Collections.min(array));
        int summaArray = 0;
        for (int i = 0; i < array.size(); i++) {
            summaArray = summaArray + array.get(i);
        }
        System.out.println("Среднее значение в списке: " + summaArray/sizeArray);
        array.removeIf(i -> i % 2 == 0);
        System.out.println(array);
    }
}
