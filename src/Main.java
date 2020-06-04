public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(miles);
        SpeedConverter.printConversion(10.5);

        System.out.println();
        System.out.println();

        MetaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MetaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MetaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println();
        System.out.println();

        System.out.println("Answers  " + BarkingDog.shouldWakeUp(true, 1) + " " +
                BarkingDog.shouldWakeUp(false, 2)  + " " +
                BarkingDog.shouldWakeUp(true, 8)  + " " +
                BarkingDog.shouldWakeUp(true, -1)    );

        System.out.println();
        System.out.println();

        System.out.println("1700 " + LeapYearCalculator.isLeapYear(1700));
        System.out.println("1800 " + LeapYearCalculator.isLeapYear(1800));
        System.out.println("1900 " + LeapYearCalculator.isLeapYear(1900));
        System.out.println("2100 " + LeapYearCalculator.isLeapYear(2100));
        System.out.println("2200 " + LeapYearCalculator.isLeapYear(2200));
        System.out.println("2300 " + LeapYearCalculator.isLeapYear(2300));
        System.out.println("2500 " + LeapYearCalculator.isLeapYear(2500));
        System.out.println("2600 " + LeapYearCalculator.isLeapYear(2600));
        System.out.println("1600 " + LeapYearCalculator.isLeapYear(1600));
        System.out.println("2000 " + LeapYearCalculator.isLeapYear(2000));
        System.out.println("2400 " + LeapYearCalculator.isLeapYear(2400));
        System.out.println("-1600 " + LeapYearCalculator.isLeapYear(-1600));
        System.out.println("1600 " + LeapYearCalculator.isLeapYear(1600));
        System.out.println("2017 " + LeapYearCalculator.isLeapYear(2017));
        System.out.println("2000 " + LeapYearCalculator.isLeapYear(2000));

        System.out.println();
        System.out.println();

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 33.123));

        System.out.println();
        System.out.println();

        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));

        System.out.println();
        System.out.println();

        // Adding new line

    }
}
