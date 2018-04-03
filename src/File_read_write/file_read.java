package File_read_write;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
    public static void main(String[] args) throws IOException {
        // Path names are relative to project directory (Eclipse Quirk )
        FileReader fr = new FileReader("./src/File_read_write/123.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}