public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3) {
        boolean hasTeen = false;

        if ( isTeen(age1)  || isTeen(age2) || isTeen(age3) )   {
            hasTeen = true;
        }
        return hasTeen;
    }

    public static boolean isTeen(int age) {
        boolean isTeen = false;
        if ( (age >= 13) && (age <= 19) ) {
            isTeen = true;
        }
        return isTeen;
    }


}
