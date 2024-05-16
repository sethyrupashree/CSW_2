
public class q5 {
    public static void main(String[] args) {
        final int iterate = 10000;
        String baseStr = "Hello";
// StringBuilder performance test
        long st = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterate; i++) {
            sb.append(baseStr);
        }
        long et = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (et - st) + " ms");
// StringBuffer performance test
        st = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterate; i++) {
            buffer.append(baseStr);
        }
        et = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (et - st) + " ms");
    }
}
