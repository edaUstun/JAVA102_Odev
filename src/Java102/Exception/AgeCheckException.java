package Java102.Exception;

public class AgeCheckException extends Exception{

    public AgeCheckException(String message) {

        super(message);
        System.out.println("Yas Hatasi alindi.");
    }
}
