
import java.util.ArrayList;

public class q6 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();

        ArrayList<Object> obj = new ArrayList<>();

        for (int num = 0; num < 1000000; num++) {
            obj.add(new byte[1024]); // Creating objects of size 1KB
            if (num % 10000 == 0) {
                printHeapInfo(st);
            }
        }

        long et = System.currentTimeMillis();
        System.out.println("Program execution time: " + (et - st) + " milliseconds");
    }

    private static void printHeapInfo(long st) {
        long currTime = System.currentTimeMillis();
        long timeStamp = currTime - st;
        long totalMem = Runtime.getRuntime().totalMemory();
        long freeMem = Runtime.getRuntime().freeMemory();

        System.out.println("Timestamp: " + timeStamp + " milliseconds");
        System.out.println("Total Memory: " + totalMem + " bytes");
        System.out.println("Free Memory: " + freeMem + " bytes");
    }
}
