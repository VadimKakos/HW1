public class Main {
    public static void main(String[] args) {

        // первое задание
        byte a = 51;
        short b = 32140;
        int c = 1234567;
        long d = 12345678987654321L;
        float e = 3.14f;
        double f = 0.77777777;
        char g = 236;
        boolean h = a >= 10;

        // второе задание


        float firstFighter = 78.2f;
        float secondFighter = 82.7f;
        float totalWeight = firstFighter + secondFighter;
        float weightDifference = secondFighter - firstFighter;
        System.out.println("Общий вес бойцов: " + totalWeight + " кг");
        System.out.println("Разница в весе составляет: " + weightDifference + "кг");

        // третье задание

        int banana = 5;
        int bananaWeight = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int iseCream = 2;
        int iseCreamWeight = 100;

        int agg = 4;
        int aggWeight = 70;

        int total = (banana * bananaWeight) + (milk * milkWeight) + (iseCream * iseCreamWeight) + (agg * aggWeight);

        int allWeightInKG = 1000;
        double totalInKG = (double)total / allWeightInKG;

        System.out.println("Вес завтрака в граммах: " + total + " гр." + "; " + " в килограммах: " + totalInKG + " кг.");

        // четвортое задание

        int sportsmensWeight = 7;
        int weightInKg = 1000;
        int sportsmensWeightInKg = sportsmensWeight * weightInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDay = sportsmensWeightInKg / minGramsPerDay;
        int maxDay = sportsmensWeightInKg / maxGramsPerDay;
        int middleDay = (maxDay + minDay) / 2;

        System.out.println("Минимальное количество дней: " + minDay + ";" + " максимальное количество дней: " + maxDay + ";" + " среднее количество дней: " + middleDay);


        // пятое задание

        float salaryOfMasha = 67760f;
        float salaryOfDenis = 83690f;
        float salaryOfChristina = 76230f;
        double newSalaryOfMasha = salaryOfMasha + salaryOfMasha * 0.1;
        double newSalaryOfDenis = salaryOfDenis + salaryOfDenis * 0.1;
        double newSalaryOfChristina = salaryOfChristina + salaryOfChristina * 0.1;
        double incomeGapsOfMasha = (newSalaryOfMasha - salaryOfMasha) * 12;
        double incomeGapsOfDenis = (newSalaryOfDenis - salaryOfDenis) * 12;
        double incomeGapsOfChristina = (newSalaryOfChristina - salaryOfChristina) * 12;

        System.out.println("Маша теперь получает: " + newSalaryOfMasha + "," + " годовой доход вырос на: " + incomeGapsOfMasha + " рублей" + ";" + " Денис теперь получает: " + newSalaryOfDenis + "," + " годовой доход вырос на: " + incomeGapsOfDenis + " рублей" + "; " + "Кристана теперь получает: " + newSalaryOfChristina + "," + " годовой доход вырос на: " + incomeGapsOfChristina + " рублей");

    }
}