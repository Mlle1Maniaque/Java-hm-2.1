public class Main {
    public static void main(String[] args) {
        int StartingBalance = 58;
        int amount = 500;
        int bonus = 0;

        if (amount < 1000) {
            bonus = 0;
            System.out.println("Вам зачислено " + amount + " рублей" + "\nИтоговый счет: " + (StartingBalance + amount)
                    + " рублей");
        }

        if (amount > 1000) {
            bonus = amount / 100;
            System.out.println("Вам зачислено " + amount + " рублей" + "\nИтоговый счет: "
                    + (StartingBalance + amount) + " рублей" + "\nЗачислено бонусов: " + bonus);
        }

    }
}