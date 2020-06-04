public class MetaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes;
        int remKiloBytes;

        // MB = KB/1024
        megaBytes = kiloBytes / 1024;
        remKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");
    }
}
