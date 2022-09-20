package Java102.Inheritance.AsistanCalisanlar;

import Java102.Inheritance.Calisanlar.Akademisyen;

public class Asistan extends Akademisyen {

    private String ofisSaati;

    public String getOfisSaati() {
        return this.ofisSaati;
    }
    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public Asistan(String fullName, String mobile, String mail, String department, String appellation, String ofisSaati) {
        super(fullName, mobile, mail, department, appellation);
        this.ofisSaati = ofisSaati;
    }


    public void quizYap() {
        System.out.println(getFullName() + " quiz yapildi.");
    }

}
