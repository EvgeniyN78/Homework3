public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задание 1.");
        byte theSmallestNumber = 100;
        System.out.println("Значение переменной theSmallestNumber с типом byte равно " + theSmallestNumber);
        short smallNumber = 32_000;
        System.out.println("Значение переменной smallNumber с типом short равно " + smallNumber);
        int ordinaryNumber = 1_000_000_000;
        System.out.println("Значение переменной ordinaryNumber с типом int равно " + ordinaryNumber);
        long largeNumber = 1_000_000_000_000_000_000L;
        System.out.println("Значение переменной largeNumber с типом long равно " + largeNumber);
        float smallFractional = 0.7F;
        System.out.println("Значение переменной smallFractional с типом float равно " + smallFractional);
        double ordinaryFractional = 1.16;
        System.out.println("Значение переменной ordinaryFractional с типом double равно " + ordinaryFractional);
        System.out.println(" ");

        //task 2
        System.out.println("Задание 2.");
        float theFirstValue = 27.12F;
        System.out.println(theFirstValue);
        long secondValue = 987_678_965_549L;
        System.out.println(secondValue);
        byte thirdValue = 2;
        System.out.println(thirdValue);
        short fourthValue = 786;
        System.out.println(fourthValue);
        boolean FifthValue = 5<2;
        System.out.println(FifthValue);
        short sixthValue = 569;
        System.out.println(sixthValue);
        short seventhValue = -159;
        System.out.println(seventhValue);
        short eighthValue = 27897;
        System.out.println(eighthValue);
        byte ninthValue = 67;
        System.out.println(ninthValue);
        System.out.println(" ");

        //task 3
        System.out.println("Задание 3.");
        short studentsClassLP = 23;
        short studentsClassAS = 27;
        short studentsClassEA = 30;
        short totalSheetsOfPaper = 480;

        System.out.println("На каждого ученика рассчитано " + totalSheetsOfPaper/(studentsClassLP+studentsClassAS+studentsClassEA) + " листов бумаги.");
        System.out.println(" ");

        //task 4
        System.out.println("Задание 4.");
        int producedBottlesPerMinute = 16/2;

        System.out.println( "За 20 минут машины произвела бутылок " + producedBottlesPerMinute * 20 + " штук");
        System.out.println( "За сутки машины произвела бутылок " + producedBottlesPerMinute * 60 * 24 + " штук");
        System.out.println( "За 3 дня машины произвела бутылок " + producedBottlesPerMinute * 60 * 24 * 3 + " штук");
        System.out.println( "За 1 месяц машины произвела бутылок " + producedBottlesPerMinute * 60 * 24 * 30 + " штук");
        System.out.println(" ");

        //task 5
        System.out.println("Задание 5.");
        int needCansOfPaint = 120;
        int needCansOfWhitePaintYfClass = 2;
        int needCansOfBrownPaintYfClass = 4;
        int totalClasses = needCansOfPaint / (needCansOfWhitePaintYfClass + needCansOfBrownPaintYfClass);

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalClasses * needCansOfWhitePaintYfClass + " банок белой краски и " + totalClasses * needCansOfBrownPaintYfClass + " банок коричневой краски.");
        System.out.println(" ");

        //task 6
        System.out.println("Задание 6.");
        float countBananas = 5F;
        float weightOfOneBananaInGrams = 80F;
        float countMilkInMl = 200F;
        float weightOf100MlInGrams = 105F;
        float countIceCream = 2F;
        float weightOfOneIceCreamInGrams = 100F;
        float countEggs = 4F;
        float weightOfOneEggInGrams = 70F;
        float totalWeighBreakfastInKilograms = ((countBananas * weightOfOneBananaInGrams) + ((countMilkInMl / 100) * weightOf100MlInGrams) + (countIceCream * weightOfOneIceCreamInGrams) + (countEggs * weightOfOneEggInGrams)) / 1000;

        System.out.println("Вес спорт-завтрака " + totalWeighBreakfastInKilograms + " кг.");
        System.out.println(" ");

        //task 7    !!!!!!!!!!!!!!! Не понятно где в этой задаче нужно использовать "Операцию остатка после деления", которая прописана в комментариях для проверки.
        System.out.println("Задание 7.");
        int taskReset = 7;
        int minProgramDayGrams = 250;
        int maxProgramDayGrams = 500;
        int daysForWeightLossProgramMin = (int) (taskReset * 1000 / minProgramDayGrams);
        int daysForWeightLossProgramMax = (int) (taskReset * 1000 / maxProgramDayGrams);

        System.out.println("При уменьшении веса на " + minProgramDayGrams + " грамм, спортсмену потребуется " + daysForWeightLossProgramMin + " дней, для похудения на " + taskReset + " кг.");
        System.out.println("А при уменьшении веса на " + maxProgramDayGrams + " грамм, спортсмену потребуется " + daysForWeightLossProgramMax + " дней, для похудения на " + taskReset + " кг.");
        System.out.println(" ");

        //task 8
        System.out.println("Задание 8.");
        int salaryMaryMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryCristyMonth = 76230;

        System.out.println("Маша теперь получает " + (salaryMaryMonth / 100 * 110) + " рублей. Годовой доход вырос на " + ((salaryMaryMonth / 100 * 110 * 12) - (salaryMaryMonth * 12)) + " рублей.");
        System.out.println("Денис теперь получает " + (salaryDenisMonth / 100 * 110) + " рублей. Годовой доход вырос на " + ((salaryDenisMonth / 100 * 110 * 12) - (salaryDenisMonth * 12)) + " рублей.");
        System.out.println("Кристина теперь получает " + (salaryCristyMonth / 100 * 110) + " рублей. Годовой доход вырос на " + ((salaryCristyMonth / 100 * 110 * 12) - (salaryCristyMonth * 12)) + " рублей.");


    }
}