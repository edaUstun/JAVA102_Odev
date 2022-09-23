package Java102.Generics.GenericMetotlar;

public class Print  {

    // T -> genel bir veri tipini ifade eder.
    public static <T, U> void printArray(T[] arr, U a) {

        for(T i : arr) {
            System.out.println(i);
        }
        System.out.println(a);
    }
}
