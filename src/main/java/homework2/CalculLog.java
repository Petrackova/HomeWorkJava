package homework2;

/*К калькулятору из предыдущего ДЗ добавить логирование.
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//3) Реализовать простой калькулятор
public class CalculLog {
    static Logger logger = Log.log(BubbleMethod.class.getName());
    public void calcul() {
        logger.log(Level.INFO, "Мы запустили Калькулятор");
        System.out.println("Простой калькулятор\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number_one = scan.nextInt();
        logger.log(Level.INFO, String.valueOf(" Первое число " + number_one));
        System.out.print("Введите второе число: ");
        int number_two = scan.nextInt();
        logger.log(Level.INFO, String.valueOf(" Второе число " + number_two));
        System.out.println("Введите операцию: + - * /");
        String name = scan.next();
        logger.log(Level.INFO, String.valueOf(" Вид операции " + name));
        switch (name) {
            case "+":
                int addition = number_one + number_two;
                System.out.printf("Сложение двух чисел:"+ number_one + " + " + number_two + " = " + addition);
                logger.log(Level.INFO, String.valueOf(" Сумма " + addition));
                break;
            case "-":
                int subtraction = number_one - number_two;
                System.out.printf("Вычитание двух чисел:"+ number_one + " - " + number_two + " = " + subtraction);
                logger.log(Level.INFO, String.valueOf(" Вычитание " + subtraction));
                break;
            case "*":
                int multiplication = number_one * number_two;
                System.out.printf("Умножение двух чисел:"+ number_one + " * " + number_two + " = " + multiplication);
                logger.log(Level.INFO, String.valueOf(" Умножение " + multiplication));
                break;
            case "/":
                try {
                    float division = number_one / number_two;
                    System.out.printf("Деление двух чисел:"+ number_one + " / " + number_two + " = " + division);
                    logger.log(Level.INFO, String.valueOf(" Деление " + division));
                    break;
                } catch (ArithmeticException e){
                    System.out.println("Делить на ноль нельзя");
                    logger.log(Level.INFO, ("Делить на 0 нельзя"));
                    break;
                }
            default:
                System.out.println("Такой операции нет");
                logger.log(Level.INFO, ("Такой операции нет"));
                break;
        }
        scan.close();
    }
}
