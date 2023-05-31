import HomeWork1.Task1;
import HomeWork1.Task2;
import HomeWork1.Task3;
import HomeWork1.Task4;
import homework2.*;
import homework3.MinMaxArray;
import homework4.QueueListMethod;
import homework4.ReverseLinkedList;

public class Main {

    public static void main(String[] args) {
 //       Домашнее задание 1

 //       Task1 task1 = new Task1();
 //       task1.triangle();
 //       Task2 task2 = new Task2();
 //       task2.numbers();
 //       Task3 task3 = new Task3();
 //       task3.calcul();
 //       Task4 task4 = new Task4();
 //       task4.func();

 //       Домашнее задание 2

 //       SqlRequest task1 = new SqlRequest();
 //       task1.StringRequest();
 //       BubbleMethod task2 = new BubbleMethod();
 //       task2.arrayBuble();
 //       JsonRequest task3 = new JsonRequest();
 //       task3.StringRequest();
 //       CalculLog task4 = new CalculLog();
 //       task4.calcul();

  //      Домашнее задание 3
 //       MinMaxArray task1 = new MinMaxArray();
 //       task1.ArrayFunction();

 //       Домашнее задание 4
        System.out.println("Задание 1");
        ReverseLinkedList task1 = new ReverseLinkedList();
        task1.reversArr();
        System.out.println("Задание 2");
        QueueListMethod task2 = new QueueListMethod();
        task2.scanArr();
        task2.printArr();
        System.out.printf("\nВозращает первый элемент без удаления " + task2.first());
        System.out.printf("\nВозращает первый элемент с удалением " + task2.dequeue() + "\n");
        task2.printArr();
    }
}