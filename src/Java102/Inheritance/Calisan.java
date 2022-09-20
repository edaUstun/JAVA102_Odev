package Java102.Inheritance;

public class Calisan {

    private String fullName;
    private String mobile;
    private String mail;

    public Calisan(String fullName, String mobile, String mail) {
        this.fullName = fullName;
        this.mobile = mobile;
        this.mail = mail;
    }


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }


    public void login() {
        System.out.println(this.fullName + " universiteye giris yapti !!");
    }

    public void exit() {
        System.out.println(this.fullName + " universiteden cikis yapti !!");
    }

    public void cafeteria() {
        System.out.println(this.fullName + " yemekhanaye giris yapti !!");
    }
}
