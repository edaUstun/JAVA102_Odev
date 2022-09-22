package Java102.Interface;

public class BBank implements IBank {

    private String bankName;
    private String terminalId;
    private String password;

    public BBank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        // Banka odeme islemleri
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("Islem Basarili oldu !");
        return true;
    }
}
