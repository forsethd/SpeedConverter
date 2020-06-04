public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {

        boolean isLeapYear;
        if (! (year >= 1 && year <= 9999) ) {
            return false;
        }

        if ((year % 4) == 0) {   // Step 1
            if((year % 100) == 0) {  // Step 2
                if ((year % 400) == 0) { // Step 3
                    // Step 4
                    isLeapYear = true;
                }
                else {
                    // Step 5, Not a leap year
                    isLeapYear = false;
                }
            }
            else {
                // Step 4
                isLeapYear = true;
            }
        }
        else {
            // Step 5, Not a leap year
            isLeapYear = false;
        }
        return isLeapYear;
    }
}
