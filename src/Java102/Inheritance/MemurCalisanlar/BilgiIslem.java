package Java102.Inheritance.MemurCalisanlar;

import Java102.Inheritance.Calisanlar.Memur;

public class BilgiIslem extends Memur {

    public BilgiIslem(String fullName, String mobile, String mail, String departman, String mesai, String gorev) {
        super(fullName, mobile, mail, departman, mesai);
        this.gorev = gorev;
    }

    private String gorev;

    public String getGorev() {
        return this.gorev;
    }
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }


    public void networkKurulumu() {
        System.out.println(getFullName() + " bilgi islemde calisiyor.");
    }
}
