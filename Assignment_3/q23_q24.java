
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q23_q24 {

    public static void main(String[] args) {

        try {
            read("example.txt");
        } catch (IOException error) {
            System.out.println("An error occurred while reading the file: " + error.getMessage());
        }
        try {
            throwException();
        } catch (FileNotFoundException error) {
            System.out.println("Caught checked exception: " + error.getMessage());
        }
    }
    public static void read(String fname) throws IOException {
        BufferedReader readornot = null;
        try {
            readornot = new BufferedReader(new FileReader(fname));
            String l;
            while ((l = readornot.readLine()) != null) {
                System.out.println(l);
            }
        } finally {
            if (readornot != null) {
                readornot.close();
            }
        }
    }
    public static void throwException() throws FileNotFoundException {
        throw new FileNotFoundException("File not found!");
    }
}
