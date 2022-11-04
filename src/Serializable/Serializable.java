package Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String[] args) {

        // Serialization -> nesneyi saklama ve sonradan okuma icin kullanilir.

        Car c1 = new Car("Auid", "A6");

        try {
            FileOutputStream outputFile = new FileOutputStream("src/Serializable/car.txt");
            // disari cikti verebilmek icin
            ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);

            outputStream.writeObject(c1);
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
