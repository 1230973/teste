import java.io.*;
public class Main2 {
    public static void findFile() throws IOException {
        File nfile = new File("test.txt");
        try (FileInputStream stream = new FileInputStream(nfile)) {
            // Your file processing code here
        }
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
