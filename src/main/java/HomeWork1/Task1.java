package HomeWork1;

import java.util.Scanner;

//n! (произведение чисел от 1 до n)
public class Task1 {
    public void triangle() {
        System.out.println("Вычислить n-ое треугольного число (сумма чисел от 1 до n)");
        System.out.println("Вычислить факториал n-ого (произведение чисел от 1 до n)\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int number = in.nextInt();
        int count = 0;
        int count1 = 1;
        for (int i = 1; i <= number; i++){
            count = count+i;
            count1 = count1*i;
        }
        System.out.println("Сумма чисел от 1 до "+ number + " равна: " + count);
        System.out.printf("Произведение чисел от 1 до "+ number + " равна: " + count1+ "\n");
        in.close();
        }
}
