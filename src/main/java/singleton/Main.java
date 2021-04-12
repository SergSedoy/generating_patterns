package singleton;

import java.util.ArrayList;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    logger.log("Запускаем программу");
    Random random = new Random();
    Scanner sca = new Scanner(System.in);
    System.out.println("Здравствуйте!");
    logger.log("Просим пользователя ввести входные данные для списка");
    System.out.println("Введите размер списка:");
    int n = sca.nextInt();
    
    System.out.println("Введите верхнюю границу для значений:");
    int maxValue = sca.nextInt();
    logger.log("Создаём и наполняем список");
    ArrayList<Integer> source = new ArrayList<>();

    for(int i = 0; i < n; i++)
        source.add(random.nextInt(maxValue));
    
    for(int i : source)
        System.out.print(" " + i);
    System.out.println();
    logger.log("Просим пользователя ввести входные данные для фильтрации");
    System.out.println("Введите порог для фильтра:");
    int f = sca.nextInt();

    logger.log("Запускаем фильтрацию");
    Filter filter = new Filter(f);
    source = filter.filterOut(source);

    logger.log("Выводим результат на экран");
    for(int i : source)
        System.out.print(" " + i);
    System.out.println();

    logger.log("Завершаем программу");
  }
}