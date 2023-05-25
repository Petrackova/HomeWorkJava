import HomeWork1.Task1;
import HomeWork1.Task2;
import HomeWork1.Task3;
import HomeWork1.Task4;
import homework2.*;

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

        SqlRequest task1 = new SqlRequest();
        task1.StringRequest();
        BubbleMethod task2 = new BubbleMethod();
        task2.arrayBuble();
        JsonRequest task3 = new JsonRequest();
        task3.StringRequest();
        CalculLog task4 = new CalculLog();
        task4.calcul();
    }
}