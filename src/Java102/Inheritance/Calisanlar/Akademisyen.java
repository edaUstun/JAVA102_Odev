package Java102.Inheritance.Calisanlar;

import Java102.Inheritance.Calisan;

public class Akademisyen extends Calisan {

    private String department;
    private String appellation;


    public Akademisyen(String fullName, String mobile, String mail, String department, String appellation) {

        super(fullName, mobile, mail);

        this.department = department;
        this.appellation = appellation;
    }

    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    public String getAppellation() {
        return this.appellation;
    }
    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }



    public void enterLesson() {
        System.out.println(this.getFullName() + " derse girdi.");
    }


}
