public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int money = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = (total + money);
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей.");
            month++;
        }

        System.out.println("Задача №2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача №3");
        int population = 12_000_000;
        double birthRate = 17.0 / 1000.0;
        double deathRate = 8.0 / 1000.0;
        int year = 2025;
        while ( year <= 2035) {
            population = population + (int) (population * birthRate) - (int) (population * deathRate);
            System.out.println("Год " + year + " численность населения составляет " + population);
            year++;
        }

        System.out.println("Задача №4");
        int money1 = 15000;
        int purpose = 12_000_000;
        double interestRate = 1.07;
        int total1 = 0;
        int month1 = 1;
        while (total1 < purpose) {
            total1 = total1 + money1;
            total1 = (int) (total1 * interestRate);
            System.out.println("Месяц " + month1 + " сумма накоплений равна : " + total1 + " рублей.");
            month1++;
        }

        System.out.println("Задача №5");
        int money2 = 15000;
        int purpose1 = 12_000_000;
        double interestRate1 = 1.07;
        int total2 = 0;
        int month2 = 0;
        while (total2 < purpose1) {
            month2++;
            total2 = total2 + money2;
            total2 = (int) (total2 * interestRate1);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна : " + total2 + " рублей.");
            }
        }

        System.out.println("Задача №6");
        int money3 = 15000;
        int accumulationPeriod = 9 * 12;
        double interestRate2 = 1.07;
        int total3 = 0;
        int month3 = 0;
        while (month3 < accumulationPeriod) {
            month3++;
            total3 = total3 + money3;
            total3 = (int) (total3 * interestRate2);
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна : " + total3 + " рублей.");
            }
        }

        System.out.println("Задача №7");
        for (int firstFriday = 1; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача №8");
        int currentYear = 2025;
        int past = currentYear - 200;
        int futureOnes = currentYear + 100;
        for (int yearZero = 0; yearZero <= futureOnes; yearZero += 79) {
            if (yearZero > past && yearZero < futureOnes) {
                System.out.println(yearZero);
            }
        }
    }
}