package homework2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
 */
public class BubbleMethod
{
    static Logger logger = Log.log(BubbleMethod.class.getName());
    public void arrayBuble () {
        logger.log(Level.INFO, "Мы запустили BubbleMethod");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArray = in.nextInt();
        logger.log(Level.INFO, String.valueOf(" Размер массива " + sizeArray));
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            logger.log(Level.INFO, String.valueOf(" Ввод " + array[i]));
        }
        System.out.println("\n");
        BubleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            logger.log(Level.INFO, String.valueOf(" Вывод " + array[i]));
        }
    }
    public void BubleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j+1] < array[j]){
                    int buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                    logger.log(Level.INFO, String.valueOf(" Метод пузырька " + array[j] + " и " + buf));
                }
            }
        }
    }
}
