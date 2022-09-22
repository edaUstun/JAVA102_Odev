package Java102.Interface;

public class ABank implements IBank{

    private String bankName;
    private String terminalId;
    private String password;


    public ABank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanici ip : " + ipAddress);
        System.out.println("Makina ip : " + this.hostIpAaddress);
        System.out.println(this.bankName + " Baglanildi !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        // Banka odeme islemleri
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("Islem Basarili oldu !");
        return true;
    }


    public String getBankName() {
        return this.bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return this.terminalId;
    }
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }


    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
