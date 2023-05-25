package HomeWork1;

import java.util.Scanner;

//3) Реализовать простой калькулятор
public class Task3 {
    public void calcul() {
        System.out.println("Простой калькулятор\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number_one = scan.nextInt();
        System.out.print("Введите второе число: ");
        int number_two = scan.nextInt();
        System.out.println("Введите операцию: + - * /");
        String name = scan.next();
        switch (name) {
            case "+":
                int addition = number_one + number_two;
                System.out.printf("Сложение двух чисел:"+ number_one + " + " + number_two + " = " + addition);
                break;
            case "-":
                int subtraction = number_one - number_two;
                System.out.printf("Вычитание двух чисел:"+ number_one + " - " + number_two + " = " + subtraction);
                break;
            case "*":
                int multiplication = number_one * number_two;
                System.out.printf("Умножение двух чисел:"+ number_one + " * " + number_two + " = " + multiplication);
                break;
            case "/":
                try {
                    float division = number_one / number_two;
                    System.out.printf("Деление двух чисел:"+ number_one + " / " + number_two + " = " + division);
                    break;
                } catch (ArithmeticException e){
                    System.out.println("Делить на ноль нельзя");
                    break;
                }
            default:
                System.out.println("Такой операции нет");
                break;
        }
        scan.close();
    }
}
