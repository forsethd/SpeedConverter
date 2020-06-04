public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        boolean wakeUp = false;


        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            //Invalid
            wakeUp = false;
        } else if ((hourOfDay >= 8) && (hourOfDay <= 22)) {
            //Don't need to wakeup if daytime
            wakeUp = false;
        } else if (isBarking) {
            //Not daytime and the dog is barking
            wakeUp = true;
        }
        return wakeUp;

    }
}

