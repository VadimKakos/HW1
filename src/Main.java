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

        double bananasWeight = 5 * 80;
        double milksWeight = 105 * 2;
        double sundaeWeight = 2 * 100;
        double aggsWeight = 4 * 70;
        double allWeight = bananasWeight + milksWeight + sundaeWeight + aggsWeight;
        int allWeightInKG = 1000;
        double allWeightKG = allWeight / allWeightInKG;
        System.out.println("Вес завтрака в граммах: " + allWeight + " гр." + "; " + " в килограммах: " + allWeightKG + " кг. ");

        // четвортое задание

        short firstApproatch = 7 * 1000 / 250;
        short secondApproatch = 7 * 1000 / 500;
        int average = (firstApproatch + secondApproatch) / 2;
        System.out.println("Если будет терять 250 гр.:" + firstApproatch + " дней" + ";" + " если будет терять 500 гр.: " + secondApproatch + " дней" + " в среднем: " + average + " день");

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