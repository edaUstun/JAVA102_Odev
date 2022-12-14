package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<IAddress> address = new ArrayList<>();
    private Date lastLogin;

    public User(String firstName, String lastName, String email, String password, String job, int age, ArrayList<IAddress> address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAddress> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<IAddress> address) {
        this.address = address;
    }
}
