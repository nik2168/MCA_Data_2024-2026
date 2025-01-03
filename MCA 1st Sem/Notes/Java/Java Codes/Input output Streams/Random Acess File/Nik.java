
import java.io.IOException;
import java.io.RandomAccessFile;

// It is used to writing purpose but can read a file in
// different formats lets say boolean, byte or integer, floats etc you know
public class Nik {
    public static void main(String[] args) throws IOException {
        RandomAccessFile r = new RandomAccessFile("temp.txt", "rw");
        r.writeChar('h');
        byte b [] = {1,2,3};
        System.out.println(r.readChar());
    }
}
