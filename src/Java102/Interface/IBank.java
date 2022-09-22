package Java102.Interface;

public interface IBank {

    final String hostIpAaddress = "127.0.0.1";

    // Ortak banka islemleri

    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String date, String cvc);



}
