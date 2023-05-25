package HomeWork1;

import java.util.Random;

//(дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
public class Task4 {
    public void func() {
        System.out.print("Уравнение: \n");
        Random random = new Random();
        int min = 10;
        int max = 50;
        int diff = max-min;
        int number_one = random.nextInt(diff + 1) + min;
        int number_two = random.nextInt(diff + 1) + min;
        int summa = number_one + number_two;
        String str1 = Integer.toString(number_one);
        String str2 = Integer.toString(number_two);
        String str3 = Integer.toString(summa);
        String str = str1 + " + " + str2 + " = " + summa;
        char ch = '?';
        int pos = 5;
        int pos1 = 1;
        char[] chars = str.toCharArray();
        chars[pos] = ch;
        chars[pos1] = ch;
        str = String.valueOf(chars);
        System.out.println(str);
        char c;
        char d;
        char q;
        if (chars[11]> chars[6]){
            int i1 = chars[11]- chars[6];
            c = (char)(i1 +'0');
        }
        else if (chars[11]== chars[6]) {
            int i1 = 0;
            c = (char)(i1 +'0');
        }
        else {
            int i1 = 10+ chars[11]- chars[6];
            c = (char)(i1 +'0');
        }
        if (chars[10]> chars[0]){
            int i2 = chars[10]- chars[0];
            d = (char)(i2 +'0');
        }
        else if (chars[10]== chars[0]) {
            int i2 = 0;
            d = (char)(i2 +'0');
        }
        else {
            int i2 = 10+ chars[10]- chars[0];
            d = (char)(i2 +'0');
        }
        chars[pos] = d;
        chars[pos1] = c;
        str = String.valueOf(chars);
        char[] chars1 = str.toCharArray();
        int z = Integer.parseInt(String.valueOf(chars1[1]));
        int x = Integer.parseInt(String.valueOf(chars1[6]));
        if (z + x >= 10) {
            int y = chars1[5] - '0';
            y = y-1;
            q = (char)(y +'0');
            chars[5]= q;
            str = String.valueOf(chars);
            System.out.print("Готовое решение: \n");
            System.out.println(str);
        }
        else {
            str = String.valueOf(chars);
            System.out.print("Готовое решение: \n");
            System.out.println(str);
        }

















}
}
