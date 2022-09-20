package Java102.Inheritance.AsistanCalisanlar;

import Java102.Inheritance.AsistanCalisanlar.Asistan;

public class LabAsistan extends Asistan {

    public LabAsistan(String fullName, String mobile, String mail, String department, String appellation, String ofisSaati) {
        super(fullName, mobile, mail, department, appellation, ofisSaati);
    }

    public void labGir() {
        System.out.println(getFullName() + " Laba Girdi.");
    }

    public void dersGir() {
        System.out.println(getFullName() + " derse girdi.");
    }
}
