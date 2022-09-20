package Java102.Inheritance.AsistanCalisanlar;

import Java102.Inheritance.Calisanlar.Akademisyen;

public class OgretimGorevlisi extends Akademisyen {

    private String doorNo;

    public String getDoorNo() {
        return this.doorNo;
    }
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public OgretimGorevlisi(String fullName, String mobile, String mail, String department, String appellation, String doorNo) {
        super(fullName, mobile, mail, department, appellation);
        this.doorNo = doorNo;
    }

}
