package File.ByteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Main {
    public static void main(String[] args) {

        // --- BYTE ARRAY STREAM ---
        // =========================


        // --- BYTE ARRAY INPUT STREAM ---
        // =========================
        byte[] array = {1,2,3,54,66, 6, 12, 3};


        // ikinci parametre : baslanilacak index numarasi
        // ucuncu parametre : bitecegi index numarasi
        ByteArrayInputStream inputStream = new ByteArrayInputStream(array,2,4);

        System.out.println("Kullanilabilen byte sayisi : " + inputStream.available());

       // byteArrayInputStream.skip(2);

        int i = inputStream.read();

        while (i != -1) {
            System.out.println(i);
            i = inputStream.read();
        }


        try {
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // --- BYTE ARRAY OUTPUT STREAM ---
        // =========================


        String data = "Java Lesson";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // string to array
        byte[] dataByteArray = data.getBytes();


        try {
            outputStream.write(dataByteArray);
            // array to string
            String newData = outputStream.toString();
            System.out.println("Cikis Akisi : " + newData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
