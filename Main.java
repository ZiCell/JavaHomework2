import ru.netology.service.CustomsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте!");
        System.out.println();
        System.out.println("Чтобы рассчитать размер пошлины, нам нужно знать цену и вес товара.");
        System.out.println();

        System.out.print("Укажите цену в рублях: ");
        int price = scanner.nextInt();

        System.out.print("Укажите вес товара в килограммах: ");
        int weight = scanner.nextInt();

        int result = CustomsService.calcCustoms(price,weight);

        System.out.println();
        System.out.println("Спасибо за информацию!");
        System.out.println("При стоимости в " + price + " руб. и весе " + weight + " кг. пошлина составит " + result + " руб.");
    }
}

