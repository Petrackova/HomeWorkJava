package homework4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.**/
public class QueueListMethod {
    private static LinkedList<Integer> arrList = new LinkedList<>();
    public boolean enqueue(int a) {
        return arrList.offer(a); // FIFO
    }
    public int first() {

        return arrList.peek(); // Без исключения, возвращает null
    }
    public int dequeue() {
        return arrList.poll(); // Без исключения, возвращает null
    }
    public void printArr() {
        System.out.println(arrList);
    }
    public void scanArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int maxRand = 10000;
        int minRand = 0;
        int sizeArray = in.nextInt();
        Random random = new Random();
        if (sizeArray == 0) {
            System.out.println("Очередь пустая");
            System.exit(0);
        }
        else {
            for (int i = 0; i < sizeArray; i++) {
                enqueue(random.nextInt((int) (Math.random() * (maxRand - minRand + 1))) + minRand);
            }
        }
    }

}
