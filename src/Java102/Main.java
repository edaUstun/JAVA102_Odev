package Java102;

import Java102.Dependecy.Course;
import Java102.Dependecy.Instructor;
import Java102.Dependecy.Student;
import Java102.Encapsulation.Book;
import Java102.Static.User;

import java.util.Scanner;




public class Main {


    public static void main(String[] args) {

        /*
        Static Kod Blogu

        User u1 = new User("Mustafa");
        User u2 = new User("Patika");
        User u3 = new User("Kalamar");

        System.out.println(User.counter);

         */

        /*

        Encapsulation Kullanimi

        Book harryPotter = new Book("Harry Potter", 154);
        Book lordOfTheRings = new Book("Lord Of the Rings", -100);

        lordOfTheRings.setName("ABC");

        System.out.println(lordOfTheRings.getName());


        System.out.println(lordOfTheRings.getPageNumber());

         */



        // uses a -> bagimli siniflar
        // has a ->  bagimsiz siniflar
        // is a ->   kalitim - bir sinif bir sinifa ait

        Student student1 = new Student("Mustafa", "Ak", "1234", "AAA", 85);
        Student student2 = new Student("Patika", "Dev", "2321", "BBB", 85);
        Student student3 = new Student("Kodluyoruz", "Java102", "1212", "CCC", 85);

        Instructor instructor1 = new Instructor("Kaya", "Kal", "CEN");

        // Composition - Aggregation ->
        // Course has an Instructor (Sinifin bir ogretmeni vardir)
        Course math = new Course("Mat101", "MAT", instructor1);

        System.out.println(math.getInstructor().getName());

        // Student[] students = {student1, student2, student3};


       // System.out.println("Ortalama: " + math.calcAvarage(students));
    }
}
