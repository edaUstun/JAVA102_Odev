package Java102.Inheritance.Calisanlar;

import Java102.Inheritance.Calisan;

public class Memur extends Calisan {

    private String departman;
    private String mesai;


    public String getDepartman() {
        return this.departman;
    }
    public void setDepartman(String departman) {
        this.departman = departman;
    }


    public String getMesai() {
        return this.mesai;
    }
    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public Memur(String fullName, String mobile, String mail, String departman, String mesai) {
        super(fullName, mobile, mail);
        this.departman = departman;
        this.mesai = mesai;
    }


    public void calis() {
        System.out.println(this.getFullName() + " memur gorevlerini yapiyor !");
    }
}
