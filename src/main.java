public class Main {
    public static void Main(String[] args) {
        System.out.println("Расчет бонусов зза пополнение кошелька");

        int balance = 100;
        int refill = 1_100;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей: " + bonus);

        System.out.println("Итоговый расчет: " + (balance + refill + bonus));
    }
}