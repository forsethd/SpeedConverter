public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        boolean equal = false;

        if ( num3 == (num1 + num2) ) {
            equal = true;
        }
        return equal;
    }
}
