package Java102.Inheritance.MemurCalisanlar;

import Java102.Inheritance.Calisanlar.Memur;

public class GuvenlikGorevlisi extends Memur {

    private String belge;

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public GuvenlikGorevlisi(String fullName, String mobile, String mail, String departman, String mesai, String belge) {
        super(fullName, mobile, mail, departman, mesai);
        this.belge = belge;
    }


    public void nobet() {
        System.out.println(getFullName() + " nobetci guvenlik gorevlisi.");
    }

}
