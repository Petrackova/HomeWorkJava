import homework6.Color;
import homework6.FilterLaptop;
import homework6.Laptop;
import homework6.Manufacturer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        /*System.out.println("Задание 1");
        ReverseLinkedList task1 = new ReverseLinkedList();
        task1.reversArr();
        System.out.println("Задание 2");
        QueueListMethod task2 = new QueueListMethod();
        task2.scanArr();
        task2.printArr();
        System.out.printf("\nВозращает первый элемент без удаления " + task2.first());
        System.out.printf("\nВозращает первый элемент с удалением " + task2.dequeue() + "\n");
        task2.printArr();*/

//         Домашняя работа 5
        /*        *//*Реализуйте структуру телефонной книги с помощью HashMap.
        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
        их необходимо считать, как одного человека с разными телефонами.
        Вывод должен быть отсортирован по убыванию числа телефонов.*//*

        List<PhonePerson> phonePeople = Arrays.asList(
                new PhonePerson("Ivanov","88005553535"),
                new PhonePerson("Petrov","88005551111"),
                new PhonePerson("Sidorov","88005552222"),
                new PhonePerson("Sviridov","88005553333"),
                new PhonePerson("Ivanov","88005554444"),
                new PhonePerson("Ivanov","88005555555"),
                new PhonePerson("Petrov","88005556666"),
                new PhonePerson("Sviridov","88005557777"),
                new PhonePerson("Sviridov","88005558888"),
                new PhonePerson("Sviridov","88005559999"));
        Map<String,List<String>> multimap = new HashMap<>();
        for (PhonePerson peoples : phonePeople) {
            multimap.computeIfAbsent(peoples.getPerson(),k-> new ArrayList<>()).add(peoples.getPhone());
        }
        System.out.println("Входные данные");
        System.out.println(multimap + "\n");
        Map<String, List<String>> phoneBook = multimap.entrySet().stream()
                .sorted(comparingInt(e -> e.getValue().size()))
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        Set<String> set = phoneBook.keySet();
        Iterator<String> itr = set.iterator();
        List<String> alKeys = new ArrayList<String>(phoneBook.keySet());
        Collections.reverse(alKeys);
        System.out.println("Обратный порядок телефонной книжки");
        for (String key: alKeys) {
            System.out.println(key + "=" +phoneBook.get(key));
        }*/

//         Домашняя работа 6
        /**Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
         *  Реализовать в java.
         Создать множество ноутбуков (Set).
         Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
         и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map или в Сет. Например:
         “Введите цифру, соответствующую необходимому критерию:
         1 - цвет
         2 - бренд**/
        Scanner in = new Scanner(System.in);
        Set<Laptop> laptops = new HashSet<>();
        System.out.println("Сегодня завоз новой техники. Выьерите количество новых товаров");
        int pullLaptop = in.nextInt();
        for (int i = 0; i < pullLaptop ; i++) {
            laptops.add(new Laptop(Color.generateRandomColor(),Manufacturer.generateRandomManufacture()));
        }
        System.out.println(laptops);
        System.out.println("Выберите пункт:");
        System.out.println("1 - Вывод всего каталога");
        System.out.println("2 - Фильтрация по цветам");
        System.out.println("3 - Фильтрация по производителю");
        int parametrFilter = in.nextInt();
        in.nextLine();
        switch (parametrFilter) {
            case 1:
                FilterLaptop.fullLaptop(laptops);
                break;
            case 2:
                System.out.println("Введите цвет для фильтрации");
                String parametrColor = in.nextLine();
                laptops = FilterLaptop.filterColor(laptops,parametrColor);
                break;
            case 3:
                System.out.println("Введите производителя фильтрации");
                String parametrManufactures = in.nextLine();
                laptops = FilterLaptop.filterManufacturer(laptops,parametrManufactures);
                break;
            default:
                System.out.println("Такого пунка нет");
                break;
        }
        System.out.println("Результаты фильтрации:");
        if (laptops.isEmpty()) {
            System.out.println("Не найдено");
        }
        else {
            for (Laptop lp:laptops) {
                System.out.println(lp);
            }
        }



    }
}
