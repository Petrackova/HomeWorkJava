package HomeWork1;
public class Task2 {
    public void numbers() {
        System.out.println("Вывести все простые числа от 1 до 1000");
        System.out.println("1\n"+"2\n"+"3");
        for (int i = 4; i <= 1000; i++) {
                if (i < 10) {
                    if (!(i % 2 == 0) && !(i % 3 == 0)) {
                        System.out.println(i);
                    }
                }
                if (i > 10) {
                    if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0)) {
                        int w = (int) Math.sqrt(i);
                        int q = (int) Math.pow(w,2);
                        if (!(q == i)) {
                            System.out.println(i);
                        }
                    }
                }
        }
    }
}
